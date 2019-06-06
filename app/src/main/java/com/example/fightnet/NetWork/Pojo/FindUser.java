package com.example.fightnet.NetWork.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FindUser {

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
private String timezone;
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
private  BookedUser bookedUser;
@SerializedName("roles")
@Expose
private List<Role> roles = null;
@SerializedName("wins")
@Expose
private Object wins;
@SerializedName("loses")
@Expose
private Loses loses;
@SerializedName("photos")
@Expose
private List<String> photos = null;
@SerializedName("mainPhoto")
@Expose
private Object mainPhoto;

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

    public BookedUser getBookedUser() {
        return bookedUser;
    }

    public void setBookedUser(BookedUser bookedUser) {
        this.bookedUser = bookedUser;
    }

    public String getTimezone() {
return timezone;
}

public void setTimezone(String timezone) {
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

public List<Role> getRoles() {
return roles;
}

public void setRoles(List<Role> roles) {
this.roles = roles;
}

public Object getWins() {
return wins;
}

public void setWins(Object wins) {
this.wins = wins;
}

public Loses getLoses() {
return loses;
}

public void setLoses(Loses loses) {
this.loses = loses;
}

public List<String> getPhotos() {
return photos;
}

public void setPhotos(List<String> photos) {
this.photos = photos;
}

public Object getMainPhoto() {
return mainPhoto;
}

public void setMainPhoto(Object mainPhoto) {
this.mainPhoto = mainPhoto;
}

}

