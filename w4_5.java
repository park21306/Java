package javaapplication16;
import java.util.Scanner;
public class JavaApplication16 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x,n,a=1;
        float sum=0,sum2=0,sum3=0,sum4;
        
        while (sum2<626)
        {

            
            if (sum2 <= 626)

            {
                sum += (1/Math.sqrt(a)*Math.sqrt(a+1)) ;
                
                a++;
            }
            if (a==625)
            {
                break;
            }
        }
        
        System.out.print( sum);
    }
    
}
