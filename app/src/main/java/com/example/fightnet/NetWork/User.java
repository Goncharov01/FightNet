package com.example.fightnet.NetWork;

public class User {
    private String email;
    private String password;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String description;

    public User(String email, String password, String name, String surname, String country, String city, String description) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.city = city;
        this.description = description;
    }

    public User() {


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
}
