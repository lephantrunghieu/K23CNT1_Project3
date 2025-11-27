package k23cnt.lpthDay06Lab.controller;

import k23cnt.lpthDay06Lab.entity.lpthAuthor;
import k23cnt.lpthDay06Lab.entity.lpthBook;
import k23cnt.lpthDay06Lab.entity.lpthBookAuthor;
import k23cnt.lpthDay06Lab.service.lpthAuthorService;
import k23cnt.lpthDay06Lab.service.lpthBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@Controller
@RequestMapping("/books")
public class lpthBookController {

    @Autowired
    private lpthBookService bookService;

    @Autowired
    private lpthAuthorService authorService;

    private static final String UPLOAD_DIR = "src/main/resources/static/";
    private static final String UPLOAD_PATH_FILE = "images/products/";

    // Hiển thị toàn bộ sách
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books/book-list";
    }

    // Form thêm sách
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new lpthBook());
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }

    // Form sửa sách
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        lpthBook book = bookService.getBookById(id);
        if (book == null) {
            return "redirect:/books";
        }
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }

    // Lưu sách + nhiều tác giả + 1 chủ biên
    @PostMapping("/save")
    public String saveBook(@ModelAttribute lpthBook book,
                           @RequestParam(value = "authorIds", required = false) List<Long> authorIds,
                           @RequestParam(value = "editorId", required = false) Long editorId,
                           @RequestParam("imageBook") MultipartFile imageFile) {

        // 1. Xử lý ảnh
        if (!imageFile.isEmpty()) {
            try {
                Path uploadPath = Paths.get(UPLOAD_DIR + UPLOAD_PATH_FILE);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                String originalFilename = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String ext = originalFilename.substring(originalFilename.lastIndexOf("."));
                String newFileName = book.getLpthCode() + ext;

                Path filePath = uploadPath.resolve(newFileName);
                Files.copy(imageFile.getInputStream(), filePath);

                book.setLpthImgUrl("/" + UPLOAD_PATH_FILE + newFileName);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 2. Xóa các liên kết cũ
        book.getBookAuthors().clear();

        // 3. Thêm tác giả + xác định chủ biên
        if (authorIds != null && !authorIds.isEmpty()) {
            List<lpthAuthor> selectedAuthors = authorService.findAllById(authorIds);

            for (lpthAuthor a : selectedAuthors) {
                lpthBookAuthor ba = new lpthBookAuthor();
                ba.setBook(book);
                ba.setAuthor(a);
                // Chỉ 1 chủ biên
                ba.setEditor(editorId != null && a.getLpthId().equals(editorId));
                book.getBookAuthors().add(ba);
            }
        }

        // 4. Lưu sách + liên kết tác giả
        bookService.saveBook(book);

        return "redirect:/books";
    }

    // Xóa sách
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }
}
