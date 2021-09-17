package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int enter1,enter2,totle = 0 ;
       String ans ;
  while(true){
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("++++++++++++++++++++VENDING MACHINE+++++++++++++++++++++++++++++++++++++"); 
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("Welcome to vending machine. Enter 1-Sandwich, 2-cake, 3-Beverage:");
       enter1 = input.nextInt();
       
       if (enter1 == 1)
       {
           System.out.print("Enter 1-Tuna (30), 2- Hamburger (40) , 3- Ham (35):");
           enter2 = input.nextInt();
           if (enter2 == 1)
           {
               totle = totle + 30;
           }
           if (enter2 == 2)
           {
               totle = totle + 40;
           }
           if (enter2 == 3)
           {
               totle = totle + 35;
           }
           
       }
       if (enter1 == 2)
       {
           System.out.print("Enter 1- Donut (17), 2- JamRoll (15), 3- Pastry (25), 4-Cookie-(10):");
           enter2 = input.nextInt();
           if (enter2 == 1)
           {
               totle = totle + 17;
           }
           if (enter2 == 2)
           {
               totle = totle + 15;
           }
           if (enter2 == 3)
           {
               totle = totle + 25;
           }
           if (enter2 == 4)
           {
               totle = totle + 10;
           }
       }
       if (enter1 == 3)
       {
           System.out.print("Enter 1- Coke (15), 2- Est (15), 3- GreenTea (60):");
           enter2 = input.nextInt();
           if (enter2 == 1)
           {
               totle = totle + 15;
           }
           if (enter2 == 2)
           {
               totle = totle + 15;
           }
           if (enter2 == 3)
           {
               totle = totle + 60;
           }
       System.out.println("Do you want to continue:");
       ans = input.next();
       if(ans.equals("Y")){
            continue;
        }
       else{
            break;
            
        }
       }
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("THANK YOU VERY MUCH. THE PRICE IS:"+totle+"Bath");
       System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  }  //loop
            
 }//method
    
}//class
