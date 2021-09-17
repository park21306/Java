package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n,a=0;
        float x,sum=0,sum2=0,sum3=0,sum4;
        
        System.out.print("Enter ten number:");
        while (true)
        {
            
            x = input.nextFloat();
            if (10 != a)

            {
                sum += (float) (Math.pow(x,2)) ;
                sum2 += (float) x;
                a++;
            }
            if (10==a)
            {
                break;
            }
        }
        sum4 = (float) (Math.sqrt(((float)sum -(float)(Math.pow(sum2,2)/(float)10))/9 ));
        System.out.printf("The mean is= %.2f",sum2/10);
        System.out.printf("\nThe standard deviation is= %.5f", sum4);
        
        
    }
    
}
