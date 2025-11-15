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
    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping("/profile")
    public String profile(Model model){
        List<Info> profile = new ArrayList<>();
// Tạo thông tin profile
        profile.add(new Info("Le Phan Trung Hieu",
                "Hieu",
                "lephantrunghieu@gmail.com",
        "lehieu.vn"));
// Đưa profile vào model
        model.addAttribute("LpthProfile", profile);
        return "profile";
    }
}