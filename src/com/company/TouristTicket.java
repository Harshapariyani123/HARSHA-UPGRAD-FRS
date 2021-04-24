package com.company;

//TouristTicket inherits the Ticket class
public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] selectedTouristLocation;


    //constructor of class TouristTicket
    public TouristTicket( String pnr,String from, String to,Flight flight, String departureDateTime,
                          String arrivalDateTime,Passenger passenger, String seatNo,float price,boolean cancelled,
                          String hotelAddress,String[] selectedTouristLocation) {
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }


    public String getHotelAddress(){
        return hotelAddress;
    }

   public String[] TouristLocation (){
        return selectedTouristLocation;
    }

    void removeTouristLocation(String location){
    System.out.println("This Location is removed");
    }

    void addTouristLocation(String location){
        System.out.println("This Location is Added");
    }
}
