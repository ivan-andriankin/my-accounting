package com.example.myaccounting.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;
    private boolean married;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Override
    public String toString() {
        return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender +
                ", note=" + note + ", profession=" + profession + "]";
    }
}
