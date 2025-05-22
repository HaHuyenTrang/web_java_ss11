package ra.ss11.model;


import ra.ss11.validator.ValidEmail;
import ra.ss11.validator.ValidPassword;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Account {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @ValidEmail
    private String email;

    @NotBlank(message = "Mật khẩu không được để trống")
    @Size(min = 8, message = "Mật khẩu phải có ít nhất 8 ký tự")
    private String password;
    @ValidPassword
    private String confirmPassword;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}