package ra.ss11.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "kh để trống")
    @Size(min = 2, max = 30, message = "2-30 kt")
    private String name;

    @NotBlank(message = "kh để trống")
    @Email(message = "sai dinh dang")
    private String email;

    @NotBlank(message = "kh để trống")
    private String phone;

    @NotBlank(message = "kh để trống")
    private String password;

    private boolean status;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isStatus() {
        return status;

    }
    public void setStatus(boolean status) {
        this.status = status;
    }


}