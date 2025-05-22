package ra.ss11.model;


import ra.ss11.validator.ValidPassword;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Account {

    @NotBlank(message = "kh đc bỏ trống")
    private String username;

    @NotBlank(message = "kh đc bỏ trống")
    @Email(message = "kh đúng định dạng")
    private String email;

    @NotBlank(message = "kh đc bỏ trống")
    @ValidPassword
    private String password;

    // Getter & Setter
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
