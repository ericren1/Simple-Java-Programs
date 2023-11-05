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
public class Member extends Passenger{
    public int yearsOfMembership;

    public Member(String name, int age) {
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p) {
        if (yearsOfMembership > 5) {
            return p*0.5;
        }
        else if (yearsOfMembership > 1 && yearsOfMembership <= 5 ){
            return p*0.1;
        } 
        else{
            return p;
        }
        
    }
}
