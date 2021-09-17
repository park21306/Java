package javaapplication9;
import java.util.Scanner;
public class JavaApplication9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name,sex;
        
        int height,weight,x,y,xx,xy;
        System.out.print("Please enter your name: ");
        name = input.nextLine();
        System.out.print("Are you male or female,"+name+" (M, F): ");
        sex =  input.next();
        System.out.print(name+", what is your height in c.m. and weight in k.g: ");
        height =input.nextInt();
        weight =input.nextInt();
        if (sex.equals("M"))
        {
            x = (int) height-105;
            xx = x - weight;
            if  (weight > xx)
                {    
                    System.out.println(name + ", your ideal weight is "+ x + " kg, you are "+ Math.abs(xx) +  " kg underweight.");
                }
                else
                {
                    System.out.println(name + ", your ideal weight is "+ x + " kg, you are "+ Math.abs(xx)+  " kg Overweight.");
                }
        }
        else 
        {
            y = height-110;
            xy = weight - y;
            if  (weight > xy)
                {    
                    System.out.println(name + ", your ideal weight is "+ y + " kg, you are "+ Math.abs(xy) +  " kg underweight.");
                }
                else
                {
                    System.out.println(name + ", your ideal weight is "+ y + " kg, you are "+ Math.abs(xy) +  " kg Overweight.");
                }
            
        }
            
        
    }
    
}
