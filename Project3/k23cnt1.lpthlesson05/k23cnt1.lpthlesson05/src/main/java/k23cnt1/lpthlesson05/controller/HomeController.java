package k23cnt1.lpthlesson05.controller;

import k23cnt1.lpthlesson05.entity.Info;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Devmaster::Trang chủ");
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/profile")
    public String profile(Model model){
        List<Info> profile = new ArrayList<>();
// Tạo thông tin profile
        profile.add(new Info("Le Phan Trung Hieu",
                "hieudev",
                "lephantrunghieu@gmail.com",
                "https://devmaster.edu.vn"));

// Đưa profile vào model
        model.addAttribute("Profile", profile);
        return "profile";
    }
}
