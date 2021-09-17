package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int k , i ,n,m ;
        n = input.nextInt();
        m = input.nextInt();
        int[][] table= new int[n][m];
        int[][] table2= new int[n][m];
        int[][] table3= new int[n][m];
        for (i = 0; i < n; i++) {
            for ( k = 0; k < n;k++){
            table [i][k]= input.nextInt();
            }
        
        }
        for (i = 0; i < n; i++) {
            for ( k = 0; k < n;k++){
            table2 [i][k]= input.nextInt();
            }
        
        }
        System.out.print("\n");
        for ( i = 0; i < n; i++) {
            for ( k = 0; k < n; k++) {
            table3[i][k]= table [i][k] + table2 [i][k]; 
            System.out.format("%d ",table3[i][k]);
            }
        System.out.print("\n");
    
        }
    }
    
}
