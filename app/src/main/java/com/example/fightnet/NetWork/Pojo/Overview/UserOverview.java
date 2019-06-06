package com.example.fightnet.NetWork.Pojo.Overview;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserOverview {


@SerializedName("name")
@Expose
private String name;
@SerializedName("surname")
@Expose
private String surname;
@SerializedName("email")
@Expose
private String email;
@SerializedName("timezone")
@Expose
private Object timezone;
@SerializedName("country")
@Expose
private String country;
@SerializedName("city")
@Expose
private String city;
@SerializedName("description")
@Expose
private String description;
@SerializedName("bookedUsers")
@Expose
private Object bookedUsers;
@SerializedName("roles")
@Expose
private List<Role> roles = null;
@SerializedName("wins")
@Expose
private Wins wins;
@SerializedName("loses")
@Expose
private Object loses;
@SerializedName("photos")
@Expose
private Object photos;
@SerializedName("mainPhoto")
@Expose
private Object mainPhoto;
@SerializedName("notifications")
@Expose
private Integer notifications;
@SerializedName("unreadedMessages")
@Expose
private Integer unreadedMessages;

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

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public Object getTimezone() {
return timezone;
}

public void setTimezone(Object timezone) {
this.timezone = timezone;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public Object getBookedUsers() {
return bookedUsers;
}

public void setBookedUsers(Object bookedUsers) {
this.bookedUsers = bookedUsers;
}

public List<Role> getRoles() {
return roles;
}

public void setRoles(List<Role> roles) {
this.roles = roles;
}

public Wins getWins() {
return wins;
}

public void setWins(Wins wins) {
this.wins = wins;
}

public Object getLoses() {
return loses;
}

public void setLoses(Object loses) {
this.loses = loses;
}

public Object getPhotos() {
return photos;
}

public void setPhotos(Object photos) {
this.photos = photos;
}

public Object getMainPhoto() {
return mainPhoto;
}

public void setMainPhoto(Object mainPhoto) {
this.mainPhoto = mainPhoto;
}

public Integer getNotifications() {
return notifications;
}

public void setNotifications(Integer notifications) {
this.notifications = notifications;
}

public Integer getUnreadedMessages() {
return unreadedMessages;
}

public void setUnreadedMessages(Integer unreadedMessages) {
this.unreadedMessages = unreadedMessages;
}

}