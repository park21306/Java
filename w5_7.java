package javaapplication19;
import java.util.Scanner;
public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k , i ,n,m=2,r=0,s=0;
        n = input.nextInt();
        float o = 0,p = 0;
        double[][] table= new double[n][m];
        boolean q = true;
        for (i = 0; i < n; i++) {
            for ( k = 0; k < 2;k++){
            table [i][k]= input.nextDouble();
            }
        
        }
        for( i=0;i<n;i++){     
            for( k=i+1;k<n;k++){
                o = (float)Math.sqrt(((table[i][0]-table[k][0])*(table[i][0]-table[k][0]))+
                            ((table[i][1]-table[k][1])*(table[i][1]-table[k][1])));
                if(q){
                    p= o ;
                    r = i+1;
                    s = k+1;
                    q=false;continue;
                }
                if(o<p){
                    p = o;
                    r = i+1;
                    s = k+1;
                }
            }
        }
        System.out.println("\n");
        System.out.printf("%d %d %.2f\n",r,s,p);
        
            
            
        
        
       
    
       
        
        
        
    }
    
}
