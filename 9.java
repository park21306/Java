package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {
        String a;
        int b,c,d,f,g,h,i,j,k,e,l,m;
        
        Scanner input = new Scanner(System.in);
        a = input.next();
        b = Character.getNumericValue(a.charAt(0))*10;  
        c = Character.getNumericValue(a.charAt(1))*9;  
        d = Character.getNumericValue(a.charAt(2))*8;  
        e = Character.getNumericValue(a.charAt(3))*7;  
        f = Character.getNumericValue(a.charAt(4))*6;  
        g = Character.getNumericValue(a.charAt(5))*5;  
        h = Character.getNumericValue(a.charAt(6))*4;  
        i = Character.getNumericValue(a.charAt(7))*3;  
        j = Character.getNumericValue(a.charAt(8))*2;  
        k = Character.getNumericValue(a.charAt(9))*1;  
        l = (b+c+d+e+f+g+h+i+j+k);
        m = l%11;
        if (m == 0)
        {
            System.out.println("valid");
            
        }
        else
        {
            System.out.println("invalid");
        }
        
        
        
        
    }
}

    