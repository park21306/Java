package javaapplication20;
import java.util.Scanner;
public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m,i,j,l,k,c,b=0;
        n = input.nextInt();
        m = input.nextInt();
        l = input.nextInt();
        k = input.nextInt();
        c = input.nextInt();
        int[][] a = new int[n][m];
        for ( i = 0; i < n; i++) {
            for ( j = 0; j < m; j++) {
                a [i][j] = input.nextInt();
                b += a[i][j];
            }
            
        }
        b += l*k*c;
        System.out.println((int)Math.ceil((float)b/c));
    }
    
}
