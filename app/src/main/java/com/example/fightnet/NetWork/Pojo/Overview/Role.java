package com.example.fightnet.NetWork.Pojo.Overview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

@SerializedName("id")
@Expose
private Id id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("authority")
@Expose
private String authority;

public Id getId() {
return id;
}

public void setId(Id id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getAuthority() {
return authority;
}

public void setAuthority(String authority) {
this.authority = authority;
}

}