package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmailBody {

@SerializedName("email")
@Expose
private String email;

    public EmailBody(String email) {
        this.email = email;
    }

    public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

}