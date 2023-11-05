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
public abstract class Passenger {
    String name;
    int age;
    
    public Passenger (String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void setName(String name){
        this.name =name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAge (int age) {
        this.age=age;
    }
    
    public int getAge () {
        return age;
    }
    
    protected abstract double applyDiscount(double p);
}
