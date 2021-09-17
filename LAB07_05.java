/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LAB07_05 {
    public static boolean found = false;
    public static String[] ans = new String[100];
    public static void turn(int[][] tt,int n,int t,String r){
        if(n<0||n>tt[0].length-1||t>tt.length-1){return;}
        if(tt[t][n]==1){return;}
        if(found){return;}
        if(tt[t][n]==0&&t==tt.length-1){found =  true;}
        if(tt[t][n]==0){ans[t]=r;}
//        if(n>=0&&n<=tt[0].length-1&&t<tt.length){
//            turn(tt,n,t+1,"3");
//            turn(tt,n-1,t+1,"1");
//            turn(tt,n+1,t+1,"2");   
//        }
//        else if(n==0&&t<tt.length){
//            turn(tt,n,t+1,"3");
//            turn(tt,n+1,t+1,"2");
//        }
//        else if(n==tt[0].length-1&&t<tt.length){
//                turn(tt,n,t+1,"3");
//            turn(tt,n-1,t+1,"1");
//        }
        turn(tt,n,t+1,"3");
        turn(tt,n-1,t+1,"1");
        turn(tt,n+1,t+1,"2"); 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int t = in.nextInt();
        int[][] tt = new int[t][m];
        for(int i = 0;i<t;i++){
            for(int j = 0;j<m;j++){
                tt[i][j] = in.nextInt();
            }
        }
        turn(tt,n-1,0,"3");
        turn(tt,n-2,0,"1");
        turn(tt,n,0,"2");
        for(int i = 0;i<t;i++){
            System.out.println(ans[i]);
        }
    }
}
