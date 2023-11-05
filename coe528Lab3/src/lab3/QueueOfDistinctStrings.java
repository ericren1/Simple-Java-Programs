/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

public class QueueOfDistinctStrings {

    /*OVERVIEW
    a)ABSTRACTION FUNCTION
        abstract(queue) = queue.all_item[0] = q0
        queu.all_item[all_item.size-1]=qn | queue = [q0....qn]
    
    b) rep invariant 
    queue.all_item != null & queue.allitemsize = n
    
    
     */
    private ArrayList<String> items;

    public QueueOfDistinctStrings() {
        items = new ArrayList<String>();
    }
// MODIFIES: this
// EFFECTS: Appends the element at the end of the queue
// if the element is not in the queue, otherwise
// does nothing.

    public void enqueue(String element) throws Exception {
        if (element == null) {
            throw new Exception();
        }
        if (false == items.contains(element)) {
            items.add(element);
        }
    }

    public String dequeue() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) {
            throw new Exception();
        }
        return items.remove(0);
    }

    public boolean repOK() throws Exception {
        QueueOfDistinctStrings Queue = new QueueOfDistinctStrings();
        if (Queue.items == null || !Queue.items.isEmpty()) {
            return false;
        }
        Queue.enqueue("ab");
        Queue.enqueue("cd");
        Queue.enqueue("ef");
        return Queue.items.size() == 3 && Queue.items.get(0).equals("ab") && Queue.items.get(1).equals("cd")
                && Queue.items.get(2).equals("ef");
    }

    public String toString() {
        String toReturn = "";
        if (items == null) {
            return "Queue is Empty..";
        }
        for (String myString : items) {
            toReturn = toReturn + "  " + myString;
        }

        return toReturn;
    }
    
    public static void main(String[] args) {
    }
    
}
