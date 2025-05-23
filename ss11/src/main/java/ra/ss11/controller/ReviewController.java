package ra.ss11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.ss11.model.Review;

import javax.validation.Valid;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("review", new Review());
        return "review-form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("review") @Valid Review review,
                             BindingResult result,
                             Model model) {
        if (result.hasErrors()) {
            return "review-form";
        }

        model.addAttribute("message", "Cảm ơn bạn đã đánh giá sản phẩm!");
        return "review-success";
    }
}
