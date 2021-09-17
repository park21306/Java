package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a;
        int c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;
        System.out.print("Please Enter ID: ");
        a = input.next();
        char[] b = a.toCharArray();
        c = Character.getNumericValue(b[0])*13;
        d = Character.getNumericValue(b[1])*12;
        e = Character.getNumericValue(b[2])*11;
        f = Character.getNumericValue(b[3])*10;
        g = Character.getNumericValue(b[4])*9;
        h = Character.getNumericValue(b[5])*8;
        i = Character.getNumericValue(b[6])*7;
        j = Character.getNumericValue(b[7])*6;
        k = Character.getNumericValue(b[8])*5;
        l = Character.getNumericValue(b[9])*4;
        m = Character.getNumericValue(b[10])*3;
        n = Character.getNumericValue(b[11])*2;
        q = Character.getNumericValue(b[12]);
        o = (c+d+e+f+g+h+i+j+k+l+m+n)%11;
        p = 11-o;
        if (q == p){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
            
        
        
        

    }

}
