package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FighterInvited {

@SerializedName("email")
@Expose
private String email;
@SerializedName("name")
@Expose
private String name;
@SerializedName("surname")
@Expose
private String surname;

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getSurname() {
return surname;
}

public void setSurname(String surname) {
this.surname = surname;
}

}