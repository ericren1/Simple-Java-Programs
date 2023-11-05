/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ericr
 */
public class Record {

    private static Record record = new Record("record.txt");
    
    //instance var
    private String filename;

    public Record(String n) {
        filename = n;
    }
    

    // Effects: Reads and prints the contents of the associated
    // File to the standard output.
    public void read() {
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    //Effects: Appends the specified message, msg, to the associated file.
    public void write(String msg) {
        try {
            FileWriter filewriter = new FileWriter(filename, true);
            filewriter.write(msg);
            filewriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Fill the blank below that obtains the sole instance of the Record class.
        //(You should not invoke the Record constructor here.)

        //Do not modify the code below
        record.write("Hello-1\n");
        record.write("Hello-2\n");
        System.out.println("Currently the file record.txt " + "contains the following lines:");
        record.read();
    }
}