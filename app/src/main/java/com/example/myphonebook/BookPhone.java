package com.example.myphonebook;

public class BookPhone {

    private String name;
    private String phone;


    public BookPhone(String name, String phone) {

        this.name = name;
        this.phone = phone;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.phone;
    }

    public void setCompany(String phone) {
        this.phone = phone;
    }

}