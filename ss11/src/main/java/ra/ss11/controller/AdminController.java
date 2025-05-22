package ra.ss11.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.ss11.model.admin;

import javax.validation.Valid;

@Controller
public class AdminController {

    @GetMapping("/admin/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("admin", new admin());
        return "register";
    }

    @PostMapping("/register")
    public String processRegisterForm(@Valid @ModelAttribute("admin") admin admin,
                                      BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        return "adminSuccess";
    }
}