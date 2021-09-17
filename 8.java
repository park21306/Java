package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,n,m=0,i=2,c;
        boolean x = true;
        
        n = input.nextInt();
        while (true)
        {
            if (n != 0)
            {
              a = input.nextInt();
              while(i <= a/2)
              {
            
                if(a % i == 0)
                {
                    x = false;
                    break;
                }

                ++i;
              }  
              m++ ;
              if (!x)
                System.out.println(" N ");
                else
                System.out.println(" Y "); 
              
            }
            if (n == m)
            {
                
                break;
                
            }
            
        }
        
    }
    
}
