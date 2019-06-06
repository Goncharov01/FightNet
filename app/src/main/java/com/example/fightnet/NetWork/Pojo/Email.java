package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Email {
    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    @SerializedName("email")
@Expose
private String email;

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

}