package ra.ss11.model;


import ra.ss11.validator.AdminGroup;
import ra.ss11.validator.UserGroup;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Account {

    @NotBlank(message = "Tên không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String name;

    @Email(message = "Email không hợp lệ", groups = {AdminGroup.class, UserGroup.class})
    @NotBlank(message = "Email không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String email;

    @NotNull(message = "Vai trò không được để trống", groups = {AdminGroup.class, UserGroup.class})
    private String role;

    @NotBlank(message = "Phòng ban là bắt buộc đối với Admin", groups = AdminGroup.class)
    private String department;

    // Getter và Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}