package ra.ss11.validator;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        if (password == null) return false;

        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
        // ^ => bắt đầu chuỗi
        // (?=.*[a-z]) => có ít nhất 1 chữ thường
        // (?=.*[A-Z]) => có ít nhất 1 chữ hoa
        // (?=.*\\d)   => có ít nhất 1 số
        // .{8,}       => ít nhất 8 ký tự
    }
}
