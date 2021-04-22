package com.company;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String selectedTouristLocation;

    public TouristTicket( String hotelAddress,String selectedTouristLocation) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }


    public String getHotelAddress(){
        return this.hotelAddress= hotelAddress;
    }

   public String TouristLocation (){
        return this.selectedTouristLocation= selectedTouristLocation;
    }

    /*void removeTouristLocation(String location){

    }

    void addTouristLocation(String location){

    } */
}
