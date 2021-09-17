package javaapplication3;
import java.util.Scanner;
class LinearEquation {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    
    public void get()
    {
        System.out.print("Enter a b c d e f :");
       Scanner input = new Scanner(System.in);
       this.a = input.nextFloat();
       this.b = input.nextFloat();
       this.c = input.nextFloat();
       this.d = input.nextFloat();
       this.e = input.nextFloat();
       this.f = input.nextFloat();
       
       
    }
    public boolean isSolvable(LinearEquation u){
        if ((u.a*u.d)-(u.b*u.c)!=0)
        {
            return true;
    
        }
        return false;
    }
    public float getX(LinearEquation u){
        float x  = ((u.e*u.d)-(u.b*u.f))/((u.a*u.d)-(u.b*u.c));
        return x;
        
    }
    public float getY(LinearEquation u){
        float y  = ((u.a*u.f)-(u.e*u.c))/((u.a*u.d)-(u.b*u.c));
        return y;
    }
}

class testLinearEquation {    
    public static void main(String[] args) {
        LinearEquation equation = new LinearEquation();
        equation.get();
        if(equation.isSolvable(equation)){
            System.out.format(" x is %.2f and y is %.2f\n",equation.getX(equation),equation.getY(equation));
        }
        else{
            System.out.print("The equation has no solution");
        }
    
     
    }      
}
