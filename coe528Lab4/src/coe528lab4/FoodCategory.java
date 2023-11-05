/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab4;

/**
 *
 * @author ericr
 */
import java.util.ArrayList;

public class FoodCategory extends FoodComponent {

    //initialize arraylists
    private ArrayList<FoodItem> items = new ArrayList<>();
    private ArrayList<FoodCategory> categories = new ArrayList<>();

    //from the parent class
    public FoodCategory(String name) {
        super(name);
    }

    //adding method
    public void add(FoodComponent component) {
        if (component instanceof FoodItem) {
            items.add((FoodItem) component);
        } 
        else if (component instanceof FoodCategory) {
            categories.add((FoodCategory) component);
        }

    }

    //Removing method
    public void remove(FoodComponent component) {
        if (component instanceof FoodItem) {
            items.remove ((FoodItem) component);
        }
        else if (component instanceof FoodCategory) {
            categories.remove((FoodCategory) component);
        }
    }

    //getPrice method
    public double getPrice() {
        double price = 0;
        for (FoodItem x : items) {
            price += x.getPrice();
        }
        return price;
    }

    //cumulative price method
    public double cumulativePrice() {
        double cumulativePrice = 0;
        for (FoodItem x : items) {
            cumulativePrice += x.getPrice();
        }

        for (FoodCategory x : categories) {
            cumulativePrice += x.cumulativePrice();
        }

         return cumulativePrice;
    }

    public void print(int level) {
        String space = "";
        for (int i = 0; i < level; i++) {
            space += "\t";
        }
        double cumulativePrice = cumulativePrice();
        System.out.printf("%s Food Category (%s,%.1f) contains: \n",space, getName(), cumulativePrice());

        for (FoodCategory x : categories) {
            x.print(level + 1);
        }
        for (FoodItem x : items) {
            x.print(level+1);
        }
    }
}
