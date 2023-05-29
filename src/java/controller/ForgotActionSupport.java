/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
import model.User;

/**
 *
 * @author nguye
 */
public class ForgotActionSupport extends ActionSupport{
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ForgotActionSupport(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public ForgotActionSupport() {
    }
    
      public String execute() throws Exception {
        String result = "";
       if(this.userName.equals("vietphuong") && this.passWord.equals("vietphuong")){
           return "success";
       }
       else
           return "fail";
      }
}
