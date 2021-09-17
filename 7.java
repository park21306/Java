package pkg6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d,e,f,g,h,i,j,k,l,m;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();
        g = input.nextInt();
        h = a+b+c+d+e+f+g;
        if (h<=100)
        {
            i = h*80;
            System.out.println(i);
            l = h*100;
            System.out.println(l);
            m = l-i;
            System.out.println(m);
        }
        if (100< h && h<250)
        {
            j = 8000+((h-100)*70);
            System.out.println(j);
            l = h*100;
            System.out.println(l);
            m = l-j;
            System.out.println(m);
        }
        if (250<= h )
        {
            k = 18430+((h-250)*60);
            System.out.println(k);
            l = h*100;
            System.out.println(l);
            m = l-k;
            System.out.println(m);
        }
        
    }
    
}
