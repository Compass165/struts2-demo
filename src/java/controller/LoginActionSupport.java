/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Struts2/ActionSupport.java to edit this template
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

public class LoginActionSupport extends ActionSupport {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public LoginActionSupport() {
    }
    
    public String execute() throws Exception {
        String result = "";
        if (this.username.equals("admin") && this.password.equals("admin")) {
            result = "success";
        } else {
            result = "fail";
        }
        return result;
    }
    
}
