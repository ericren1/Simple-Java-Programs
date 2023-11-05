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
public class Flight {
    public int flightNumber;
    public String origin;
    public String destination;
    public String departureTime;
    public int capacity;
    public int numberOfSeatsLeft;
    public double originalPrice;
    
    public Flight(int flightNumber,String origin, String destination, String departureTime, int capacity, double originalPrice ) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.numberOfSeatsLeft = capacity;
        this.originalPrice = originalPrice;
        
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("the destination cannot be your origin");
        }
    }
    
    public int getflightNumber() {
        return flightNumber;
    }
    
    public void setflightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getOrigin() {
        return origin;
    }
    
    public void setOrigin (String origin) {
        this.origin = origin;
    }
    
    public String getDestination() {
        return destination;
    }
    
    public void setDestination (String destinaton) {
        this.destination = destination;
    }
    
    public String getdepartureTime() {
        return departureTime;
    }
    
    public void setdepartureTime() {
        this.departureTime = departureTime;
    }
    
    public int getCapacity () {
        return capacity;
    }
    
    public void setCapacity (int capacity) {
        this.capacity = capacity;
    }
    
    public int getnumberOfSeatsLeft () {
        return numberOfSeatsLeft;
    }
    
    public void setnumberOfSeatsLeft (int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }
    
    public double getoriginalPrice () {
        return originalPrice;
    }
    
    public void setoriginalPrice (double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    
    
    
    public boolean bookASeat() {
        if (numberOfSeatsLeft > 0) {
            numberOfSeatsLeft --;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "flight number: " + flightNumber +
                "origin: " + origin +
                "destination: " + destination +
                "departure Time: " + departureTime +
                " capacity: " + capacity +
                "number of Seats Left: " + numberOfSeatsLeft +
                "original Price: " + originalPrice;
    }
}
