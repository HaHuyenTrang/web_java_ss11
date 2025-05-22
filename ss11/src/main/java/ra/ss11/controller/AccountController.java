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

    @GetMapping("/registerAccount")
    public String showRegisterForm(Model model) {
        model.addAttribute("account", new Account());
        return "account-register";
    }

    @PostMapping("/accoutss")
    public String processRegisterForm(@Valid @ModelAttribute("account") Account account,
                                      BindingResult result) {
        if (result.hasErrors()) {
            return "account-register";
        }
        return "account";
    }
}