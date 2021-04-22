package com.company;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private boolean cancelled;

   public String checkStatus(){
        return this.arrivalDateTime;
    }

    //public String getFlightDuration(){
       // String st = this.departureDateTime - this.arrivalDateTime;
        //return st;
    //}

   // public void cancel(){
     //   return this.cancelled;
    //}
}
