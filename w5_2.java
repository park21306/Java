package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, i, j, e = 10, m = 0;
        int[] f = new int[10];
        int[] g = new int[10];
        
        for (i = 0; i < 10; i++) {
            f[i] = input.nextInt();

        }
        for (i = 0; i < 10; i++) {
            
            g[i] = input.nextInt();
            if (g[i]>20){
                g[i] = 20;
            }

        }
        for ( i = 0; i < 10; i++) {

            for ( j = e - 1; j > i; j--) {

                if (g[j] < g[j - 1]) {

                    m = g[j];

                    g[j] = g[j - 1];

                    g[j - 1] = m;

                
                

                    m = f[j];

                    f[j] = f[j - 1];

                    f[j - 1] = m;
                }
            }

        }

        

        System.out.print("\n");

        for ( i = 0; i < 3; i++) {
            
            System.out.print(f[i]);
            System.out.println(g[i]);
            }
        System.out.print("\n");

        
       

    }

}
