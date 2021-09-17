/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.Scanner;
/**
 *
 * @author Pochiz
 */
public class LAB05_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] fi = new int[100][100];
        int n,m,l,k,c,sum=0;
        n = in.nextInt();
        m = in.nextInt();
        l = in.nextInt();
        k = in.nextInt();
        c = in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                fi[i][j] = in.nextInt();
                sum += fi[i][j];
            }
        }
        sum += l*k*c;
        System.out.println((int)Math.ceil((float)sum/c));
    }
}
