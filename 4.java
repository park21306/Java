package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Final,Midterm,Homework,fn,md,hw,x;
        System.out.print("Please enter score Midterm :");
        Midterm= input.nextInt();
        System.out.print("Please enter score Final :");
        Final= input.nextInt();
        System.out.print("Please enter score Homework :");
        Homework= input.nextInt();
        fn = (int) ((int)Final*0.5);
        md = (int) ((int)Midterm*0.4);
        hw = (int) ((int)Homework*0.1);
        x =  (int) (fn+md+hw);
        if (x>=90&&x<=100)
            System.out.print("grade = ‘A’");
            
        else if (x>=85&&x<90)
        {
            System.out.print("grade = ‘B+’");
        } 
         else if (x>=80&&x<85)
        {
            System.out.print("grade = ‘B’");
        } 
         else if (x>=70&&x<80)
        {
            System.out.print("grade = ‘C+’");
        } 
         else if (x>=60&&x<70)
        {
            System.out.print("grade = ‘C’");
        } 
         else if (x>=55&&x<60)
        {
            System.out.print("grade = ‘D+’");
        } 
         else if (x>=50&&x<55)
        {
            System.out.print("grade = ‘D’");
        }
         else if ( x < 50)
        {
            System.out.print("grade = ‘F’");
        }
    }
}
