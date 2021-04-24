package com.company;
public class Main {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("Wanawori", "Pune", "Maharashtra", "Harsha",
                "98234657", "xyz@gmail.com");

        Flight flight = new Flight("456789", "AirIndia", 300, 200);

        String[] selectedTouristLocation = {"Hyderabad", "Delhi", "Dehradun"}; //Array for selectedTouristLocation


        // Two objects of class Ticket are made
        TouristTicket touristTicket = new TouristTicket("345678", "Pune", "Delhi", flight, "2012-09-19 13:00",
                "2012-09-19 13:50", passenger, "1A", 10000, false, "SB Road", selectedTouristLocation);


        RegularTicket regularTicket = new RegularTicket("987653", "Mumbai", "Delhi", flight, "2012-09-19 11:00",
                "2012-09-20 11:50", passenger, "1D", 8000, false, "Food");


        printTicketDetails(regularTicket);   //printTicketDetails() method called twice with both the objects to print their PNR numbers
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket) {       //method to print ticket details
        System.out.println("The Pnr of ticket is: " + ticket.getPnr());
    }

}



