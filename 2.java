package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A,B,C,m,Y;
        System.out.print("Please enter A :");
        A = input.nextInt();
        System.out.print("Please enter B :");
        B = input.nextInt();
        System.out.print("Please enter C :");
        C = input.nextInt();
        System.out.print("Please enter m :");
        m = input.nextInt();
        if ( m > 7)
        {
            Y = (int)(A*Math.pow(m,2)+B*m+C);
            System.out.print("The result of Y = " + Y);
        }    
        if ( m == 7)
        {
            Y = (int)(A*Math.pow(m,2)-B*m-C);
            System.out.print("The result of Y = " + Y);
        }
        if ( m < 7)
        {
            Y = (int)(A*Math.pow(m,2)+B*m);
            System.out.println("The result of Y = " + Y);
        }
        
    }
}
    
