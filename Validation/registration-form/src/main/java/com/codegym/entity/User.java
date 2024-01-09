package com.codegym.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User{
    @NotEmpty(message = "Không được để trống")
    @Size(min = 1, max = 45, message = "firstName có độ dài từ 1-45 kí tự")
    private String firstName;
    @NotEmpty(message = "Không được để trống")
    @Size(min = 1, max = 45)
    private String lastName;
    @Pattern(regexp = "(^$|[0-9]{10})", message = "SĐT phải có 10 chữ số và bắt đàu từ số 0")
    private String phoneNumber;
    @Min(value = 18, message = "Tuổi phải trên 18")
    private int age;
    @Email(message = "Email không đúng định dạng")
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
