package ra.ss11.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = PasswordConstraintValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPassword {
    String message() default "8 ki tu 1 chu viet hoa.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}