/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.UrlValidator;

/**
 *
 * @author Admin
 */
public class User {
    private String username;
    private String password;
    private String type;
    private String email;
    private String website;

    @RequiredStringValidator(message = "Username required!")
    @StringLengthFieldValidator(minLength = "3", maxLength = "10", message = "Username must be 3 - 10 character")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @RequiredStringValidator(message = "Password required!")
    @StringLengthFieldValidator(minLength = "3", maxLength = "10", message = "Password must be 3 - 10 character!")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @RequiredStringValidator(message = "Type required!")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @RequiredStringValidator(message = "Email required!")
    @EmailValidator(message = "Email invalid!")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @UrlValidator(message = "Website invalid!")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
}
