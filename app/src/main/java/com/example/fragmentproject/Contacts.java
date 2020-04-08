package com.example.fragmentproject;

public class Contacts {                    //  ViewModel class for RecyclerView

    private  String name;
    private String phone;
    private int photo;

    public Contacts() {         // Default constructor
    }

    public Contacts(String name, String phone, int photo) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;

    }

    //  GETTER METHODS
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPhoto() {
        return photo;
    }


    //  SETTER METHODS
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String desc) {
        this.phone = desc;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


}
