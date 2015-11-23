package com.example.paulj.databinding;

/**
 * Created by paulj on 11/22/2015.
 */
public class LoginViewModel {

    public final String userName;
    public final String password;

    public LoginViewModel(String currentUserName) {
        this.userName = currentUserName;
        this.password = "";
    }
}
