package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,n,b,c =1,d=0,k=2,e=0;
        n = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(true)
        {
            if (n!=0)
            {
                e = (int) ((Math.pow(k,2)*b)-a+Math.pow(3,k));
                a = b;
                b = e;
                
                c++;
                k= k+1;
                
                System.out.print(e+" ");
            }
            if (n==c) 
            {
                
                break;
                
                
                
            }
        }
        
        
    }
    
}
