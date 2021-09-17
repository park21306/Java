package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,n,i,f = 0;
        x = input.nextInt();
        n = input.nextInt();
        for ( i = 0; i <= n; i++) 
        {
            f += Math.pow(x,i);
        }
        System.out.println(f);
   }
    
}
