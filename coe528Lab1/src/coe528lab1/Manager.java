/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab1;
import java.util.*;

/**
 *
 * @author ericr
 */
public class Manager {
    public void createFlights() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter flight information");
        String info = sc.nextLine();
        System.out.println("You entered: " + info);
    }
    
    public void displayAvailableFlights (String origin, String destination) {
        
    }
    
    public Flight getFlight (int flightNumber) {     
        return null;
    }
    
    public void bookSeat (int flightNumber, Passenger p) {
        
    }
    
    public static void main(String [] args) {
        
    }
}
