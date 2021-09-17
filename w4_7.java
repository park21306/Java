package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a,b=0,c=0,d=0,i=0,x;
        a = input.nextFloat();
        
        while(true)
        {
            if (a!=0)
            {
                b = (float) (a+b)*(float)(1 + 0.00417);
                
                
                i++;
            }
            if (i==6) 
            {
                break;
            }
        }
        System.out.printf("%.2f",b);
    }
    
}
