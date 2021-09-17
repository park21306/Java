package javaapplication12;
import java.util.Scanner;
public class JavaApplication12 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f,i;
        System.out.print("Please enter number of factorial : ");
        f = input.nextInt();
        for (i=1;f!=0;f--)
            i=i*f;
        System.out.println(i);
    }
    
}
