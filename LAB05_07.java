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
public class LAB05_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float[][] point = new float[1000][1000];
        boolean f = true;
        float min=0,ans=0;
        int n = in.nextInt(),p1=0,p2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                point[i][j]=in.nextFloat();
            }
        }
        for(int i=0;i<n;i++){     
            for(int j=i+1;j<n;j++){
                ans = (float)Math.sqrt(((point[i][0]-point[j][0])*(point[i][0]-point[j][0]))+
                            ((point[i][1]-point[j][1])*(point[i][1]-point[j][1])));
                if(f){min= ans ;
                    p1 = i+1;
                    p2 = j+1;
                    f=false;continue;}
                if(ans<min){min = ans;
                    p1 = i+1;
                    p2 = j+1;
                }
            }
        }
        System.out.println("================");
        System.out.printf("%d %d %.2f\n",p1,p2,min);
    }
}
