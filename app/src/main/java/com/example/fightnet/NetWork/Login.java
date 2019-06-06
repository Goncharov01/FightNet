package com.example.fightnet.NetWork;

public class Login {
    private String email;
    private String password;
// класс Login в котором создали две переменные к ним констроктор и get/set
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Login() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
