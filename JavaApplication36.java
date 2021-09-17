/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author Win10Pro
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    static int sum = 0;
    static int c;

    public static void main(String[] args) {

        int[] y = {1, 2, 3, 4, 5};

        c = y.length;
        System.out.println(summation(y)); //15

    }

    public static int summation(int[] array) {

        c--;
        if (c < 0) {
            return sum;
        } else {
            sum += array[c];
            return summation(array);

        }
    }

}
