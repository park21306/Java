package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k , i ,n,m ;
        n = input.nextInt();
        m = input.nextInt();
        int[][] table= new int[n][m];
        
        for (i = 0; i < n; i++) {
            for ( k = 0; k < n;k++){
            table [i][k]= input.nextInt();
            }
        
        }
        System.out.print("\n");
        for ( i = 0; i < n; i++) {
            for ( k = 0; k < n; k++) {
             
            System.out.format("%d ",table[k][i]);
            }
        System.out.print("\n");
    
        }
        
        
       
            
        
        
        
    }
}    

