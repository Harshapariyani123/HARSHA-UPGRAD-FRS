package com.company;

//RegularTicket inherits the Ticket class
public class RegularTicket extends Ticket {
    private String specialServices;

    //constructor of class RegularTicket
    public RegularTicket( String pnr,String from, String to,Flight flight, String departureDateTime,
                          String arrivalDateTime,Passenger passenger, String seatNo,float price,boolean cancelled,
                          String specialServices) {
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled);
        this.specialServices = specialServices;

    }

    public String getSpecialServices(){
        return specialServices;
    }

   public String updateSpecialServices(){
       return this.specialServices = specialServices;
    }
}
