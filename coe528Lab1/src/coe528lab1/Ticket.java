/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab1;

/**
 *
 * @author ericr
 */
public class Ticket {
    Passenger passenger;
    Flight flight;
    double price;
    static int ticketNumber;
    
    public Ticket (Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        this.ticketNumber +=1;
    }
    
    public Passenger getPassenger() {
        return passenger;
    }
    
    public void setPassenger (Passenger passenger){
        this.passenger = passenger;
    }
    
    public Flight getFlight () {
        return flight;
    }
    
    public void setFlight (Flight flight) {
        this.flight=flight;
    }
    
    public double getPrice (){
        return price;
    }
    
    public void setPrice (double price) {
        this.price=price;
    }
    
    public static int getticketNumber() {
        return ticketNumber;
    }
    
    public void setticketNumber (int ticketNumber) {
        Ticket.ticketNumber = ticketNumber;
    }
    
    @Override
    public String toString() {
        return "Passenger :" + passenger +
                "\nTicket Number: " + ticketNumber +
                "\nFlight: " + flight +
                "\nPrice: " + price;
    }
}
