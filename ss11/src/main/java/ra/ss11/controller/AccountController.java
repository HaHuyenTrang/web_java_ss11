package ra.ss11.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.ss11.model.Account;

import javax.validation.Valid;


@Controller
public class AccountController {

    @GetMapping("/registerA")
    public String showRegisterForm(Model model) {
        model.addAttribute("account", new Account());
        return "account-register";
    }

    @PostMapping("/registerA")
    public String processRegisterForm(@Valid @ModelAttribute("account") Account account,
                                      BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "account-register";
        }
        return "register-success";
    }
}