package com.example.first;

public class Customer {

    private String name;
    private String surname;
    private String phonenumber;

    public Customer() {

    }
    public Customer(String name, String surname, String phonenumber) {
        this.name = name;
        this.surname = surname;
        this.phonenumber = phonenumber;
    }
    public String getFirstName() {
        return name;
    }
    public void setFirstName(String firstName) {
        this.name = firstName;
    }
    public String getLastName() {
        return surname;
    }
    public void setLastName(String lastName) {
        this.surname = lastName;
    }
    public String getPhoneNumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}




