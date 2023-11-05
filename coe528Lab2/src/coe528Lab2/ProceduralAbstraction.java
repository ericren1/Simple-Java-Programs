/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ericr
 */
package coe528Lab2;

public class ProceduralAbstraction {

    /*
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number");
     */

    //implementing reversalFactoial classas showin in example 1
    public static int reverseFactorial(int x) {
        //checks if number is positive
        if (x <= 0) {
            return 1;
        }
        int y = 1;
        int factor = 1;
        while (factor < x) {
            y++;
            factor = factor * y;
        }
        return y;

    }

    //implementing ex2
    public static boolean isMatrixNice(int[][] arr) {
        //is input valid
        if (arr == null || arr.length == 0) {
            return false;
        }
        //holds initial sum value to match to each other row/col/diag
        int sum = 0;
        //checking if matrix is square
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                return false;
            }
            //finding sum of row
            int row = 0;
            for (int j = 0; j < arr[i].length; j++) {
                row += arr[i][j];
            }
            if (i == 0) {
                sum = row;
            } 
            //if sums doesnt match return false
            else if (sum != row) {
                return false;
            }
        }
        //finding sum of collumns
        for (int i = 0; i < arr.length; i++) {
            int col = 0;
            for (int j = 0; j < arr.length; j++) {
                col += arr[j][i];
            }
            //if collumn sum doesnt match retrun false
            if (col != sum) {
                return false;
            }
        }
        //diagonal sums
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < arr.length; i++) {
            diag1 += arr[i][i];
            diag2 += arr[arr.length - 1 - i][i];
        }
        //if diagonal sums dont match the sum retrun false else return true
        if (diag1 != sum || diag2 != sum) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Reversal Factorial test");
        //reversal factorial test cases
        System.out.println("reverseFactorial(24): " + reverseFactorial(24));
        System.out.println("reverseFactorial(119): " + reverseFactorial(119));

        if (reverseFactorial(-100) == 1) {
            System.out.println("not positive");
        } else {
            System.out.println("reverseFactorial(-100): " + reverseFactorial(-100));
        }

        //matrix nice test cases
        System.out.println("\nMatrix nixe test");
        int matrix1[][] = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        if (isMatrixNice(matrix1)) {
            System.out.println(""+"nice matrix");
        } else {
            System.out.println("not nice");
        }
        int matrix2[][] = {{-3, 1, 0}, {4, -3, 4}, {7, -9, 0}};
        if (isMatrixNice(matrix2)) {
            System.out.println("/n nice matrix");
        } else {
            System.out.println("not nice");
        }
    }

}
