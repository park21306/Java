package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m = 0,a=0,c=0,b = 0;
       
        while(true){
            n = input.nextInt();
            if (n != 0) 
            {
                if (a <= n)
                {
                    a = n;
                    c = (c+1); 
                    
                }
                
            }
            else
            {
                
                break;
                
            }
        } 
        c = c-1;
        System.out.println(a);
        System.out.println(c);
    }
    
}
