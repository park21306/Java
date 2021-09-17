package javaapplication13;
import  java.util.Scanner;
public class JavaApplication13 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int a,j,k,e;
        System.out.println(" ");
        a=input.nextInt();
        e = a%2;
        if (e != 0)
        {
            for ( j = 1 ; j <= a; j= j+2) {
                for ( k = 1; k > a + j; k=k+2) {
                }
                for ( k = 0; k < j; k++) {
                    System.out.print("*");
                }
            System.out.println();
            }
            for ( j = a-2; j > 0; j=j-2) {
                for ( k = 1; k <= a ; k=k+1) {
                }
                for ( k = 1; k <= j; k++) {
                    System.out.print("*");
            }
            System.out.println();
            }
        }
        if(e == 0)

        {
        for ( j = 2 ; j <= a; j= j+2) {
            for ( k = 1; k > a + j; k=k+2) {
            }
                for ( k = 0; k < j; k++) {
                    System.out.print("*");
            }
        System.out.println();
        }
        for ( j = a-1; j > 0; j=j-2) {
            for ( k = 1; k <= a ; k=k+1) {
            }
                for ( k = 2; k <= j; k++) {
                    System.out.print("*");
            }
        System.out.println();
        }
        } 
    }
    
}
