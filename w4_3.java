package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,i,j,k = 0;
        System.out.print("");
        a = input.nextInt();
        for ( i = 0; i < a; i++)

        {
            for ( j = 0; j< a; j++){
               k = i+j+1;
               if(k > a)
                {
                   k-=a; 
                }

            System.out.print(" "+k);
            }
            System.out.print("\n");

            

        } 
    }
    
}
