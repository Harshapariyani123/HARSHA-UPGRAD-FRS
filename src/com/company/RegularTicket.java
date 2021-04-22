package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;


    public RegularTicket( String specialServices) {
        this.specialServices = specialServices;

    }

    public String getSpecialServices(){
    return this.specialServices = specialServices;
    }

   /* public String updateSpecialServices(){

    }*/
}
