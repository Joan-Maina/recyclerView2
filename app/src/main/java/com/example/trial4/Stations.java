package com.example.trial4;

public class Stations {
    private String Name;
    private String NumberBikes;
    private int Photo;

    public Stations() {
    }

    public Stations(String name, String noBikes, int photo) {
        Name = name;
        NumberBikes = noBikes;
        Photo = photo;
    }

    //getter

    public String getName() {
        return Name;
    }

    public String getNumberBikes() {
        return NumberBikes;
    }

    public int getPhoto() {
        return Photo;
    }
    //setter

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String noBikes) {
        NumberBikes = noBikes;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
