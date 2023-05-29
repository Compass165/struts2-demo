/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
import model.User;

/**
 *
 * @author Admin
 */
public class RegisterActionSupport extends ActionSupport {
    
    private User user;
    
    @VisitorFieldValidator

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public RegisterActionSupport() {
    }
    
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
