package javaapplication5;
import java.util.Scanner;
public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1,number2,result;
        String operator;
        System.out.print("Please enter number1: ");
        number1 = input.nextInt();
        System.out.print("Please enter number2: ");
        number2 = input.nextInt();
        System.out.print("Please enter operator: ");
        operator = input.next();
        switch (operator) {
            case "+":
                System.out.print("Result is = "+(number1+number2));
            break;
            case "-": 
                System.out.print("Result is = "+(number1-number2));
            break;
            case "*": 
                System.out.print("Result is = "+(number1*number2));
            break;
            case "/":if (number2 == 0){ 
                System.out.print("Error");break;
            }
            else{
                System.out.print("Result is = "+(number1/number2));break;
            }
            
            
             
        }
        
        
    
        
                
                
    }
    
}
