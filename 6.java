package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v,t,n,m=0;
        float s = 0;
        double o;
        n = input.nextInt();
        while (true)
        {
            if (n != 0)
            {
              v = input.nextInt();
              t = input.nextInt();
              o = ((v*1000)/3600.0)*(t*60);
              s+= o;
              m ++ ;
            }
            if (n == m)
            {
                break;
            }
        }
        System.out.format("%.1f",s/1000);
         
            
        
    }
    
}
