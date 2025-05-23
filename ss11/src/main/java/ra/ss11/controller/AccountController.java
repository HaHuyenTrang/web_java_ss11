package ra.ss11.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.ss11.model.Account;
import ra.ss11.validator.AdminGroup;
import ra.ss11.validator.UserGroup;

import javax.validation.*;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/register")
    public String hienThiForm(Model model) {
        model.addAttribute("account", new Account());
        return "account-form";
    }

    @PostMapping("/register")
    public String xuLyDangKy(@ModelAttribute("account") Account account, Model model) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<Account>> violations;
        if ("admin".equals(account.getRole())) {
            violations = validator.validate(account, AdminGroup.class);
        } else {
            violations = validator.validate(account, UserGroup.class);
        }

        if (!violations.isEmpty()) {
            model.addAttribute("errors", violations);
            return "account-form";
        }

        model.addAttribute("message", "Đăng ký thành công!");
        return "result";
    }
}
