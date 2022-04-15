package com.company.view;

import com.company.service.user.UserServiceIMPL;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LoginView {
    public LoginView(){
        System.out.println("LOGIN FORM");
        System.out.println("LIST USER ------> "+ UserServiceIMPL.userList);
    }
}
