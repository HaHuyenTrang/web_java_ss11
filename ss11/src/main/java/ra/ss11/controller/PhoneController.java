package ra.ss11.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.ss11.model.Phone;

import javax.validation.Valid;

@Controller
@RequestMapping("/phone")
public class PhoneController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("phone", new Phone());
        return "phone-form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("phone") @Valid Phone phone,
                             BindingResult result,
                             Model model) {
        if (result.hasErrors()) {
            return "phone-form";
        }
        model.addAttribute("message", "Đăng ký thành công!");
        return "phone-success";
    }
}