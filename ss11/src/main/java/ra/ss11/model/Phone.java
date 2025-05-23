package ra.ss11.model;


import ra.ss11.validator.ValidPhone;

import javax.validation.constraints.NotBlank;

public class Phone {

    @NotBlank(message = "Tên không được để trống")
    private String name;

    @ValidPhone
    private String phoneNumber;

    // Getter & Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}