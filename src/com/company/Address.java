package com.company;

public class Address {

    public String street;
    public String city;
    public String state;
    
    
    public String getAddressDetails(){
        return "Address is "+ street + ", " + city + ", " + state;
    }

    /*public String updateAddressDetails(){

    }*/
}
