/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class work8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,u,k=0,c;
        a = input.nextInt();
        while(k !=a){
        String j = "Y";
        b = input.nextInt();
        k++;
        if(b==1)
            j = "N";
        c=(int)Math.sqrt(b);
        System.out.format("%s \n",c);
            int i;
        for(i = 2 ; i<=c; i++){
            if(b%i==0){
                j ="N";break;
            }
        }
        System.out.format("%s \n",j);
    }
    }
    
            }
    

