package com.company;

public class Flight {
 private String flightNumber;
 private String airline;
 private int capacity;
 private int bookedSeats;

// static {
  //incrementBookingCounter = 0;
 //}

 public String getFlightDetails(){
  //return Flight.flightNumber + ", " + Flight.airline + ", " + Flight.capacity + ", " + Flight.bookedSeats;
  return "Flight is "+ flightNumber + ", " + airline  + ", " + capacity + ", " + bookedSeats;
 }

 //public boolean checkAvailability(){
 //return this.capacity - this.bookedSeats;
 //}

 //public  void incrementBookingCounter(){
 //return this.bookedSeats= this.bookedSeats;
 //}


}
