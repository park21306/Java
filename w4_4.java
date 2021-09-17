package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int i,j,k ;
        
       int a = input.nextInt();
       int b = input.nextInt();
        for ( i = 1; i <= a; i++)
            
               
        {
            for ( j = 1; j<= b; j++){
                if (j == 1&&i==1)
               {
                   System.out.print("    ");
               }  
               else
                {
                    System.out.printf("%4d",i*j);
                } 
                
             
            }
            System.out.print("\n");
                
        }  
    }
}
