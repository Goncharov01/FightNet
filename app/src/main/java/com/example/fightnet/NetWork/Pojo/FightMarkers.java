package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FightMarkers {

@SerializedName("id")
@Expose
private String id;
@SerializedName("fighterInviter")
@Expose
private FighterInviter fighterInviter;
@SerializedName("fighterInvited")
@Expose
private FighterInvited fighterInvited;
@SerializedName("latitude")
@Expose
private Double latitude;
@SerializedName("longitude")
@Expose
private Double longitude;
@SerializedName("fightStyle")
@Expose
private String fightStyle;
@SerializedName("date")
@Expose
private Integer date;
@SerializedName("accepted")
@Expose
private Boolean accepted;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public FighterInviter getFighterInviter() {
return fighterInviter;
}

public void setFighterInviter(FighterInviter fighterInviter) {
this.fighterInviter = fighterInviter;
}

public FighterInvited getFighterInvited() {
return fighterInvited;
}

public void setFighterInvited(FighterInvited fighterInvited) {
this.fighterInvited = fighterInvited;
}

public Double getLatitude() {
return latitude;
}

public void setLatitude(Double latitude) {
this.latitude = latitude;
}

public Double getLongitude() {
return longitude;
}

public void setLongitude(Double longitude) {
this.longitude = longitude;
}

public String getFightStyle() {
return fightStyle;
}

public void setFightStyle(String fightStyle) {
this.fightStyle = fightStyle;
}

public Integer getDate() {
return date;
}

public void setDate(Integer date) {
this.date = date;
}

public Boolean getAccepted() {
return accepted;
}

public void setAccepted(Boolean accepted) {
this.accepted = accepted;
}

}