package k23cnt.lpthDay06Lab.service;
import k23cnt.lpthDay06Lab.entity.lpthBook;
import k23cnt.lpthDay06Lab.repository.lpthBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class lpthBookService {
    @Autowired
    private lpthBookRepository lpthbookRepository;
    public List<lpthBook> getAllBooks() {
        return lpthbookRepository.findAll();
    }
    public lpthBook saveBook(lpthBook book) {
        return lpthbookRepository.save(book);
    }
    public lpthBook getBookById(Long id) {
        return lpthbookRepository.findById(id).orElse(null);
    }
    public void deleteBook(Long id) {
        lpthbookRepository.deleteById(id);
    }
}