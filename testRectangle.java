


import java.util.Scanner;

class Rectangle{
    private double x,y,w,h;
    private double tlx,tly,brx,bry;
    Rectangle(double x,double y,double w,double h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.tlx = (x-(w/2));
        this.tly = (y+(h/2));
        this.brx = (x+(w/2));
        this.bry = (y-(h/2));
    }
    public boolean IsInside(Rectangle a){
        if(this.brx < a.tlx || a.brx < this.tlx ){
            return false;
        }
        
        if(this.tly < a.bry || a.tly < this.bry ){
            return false;
        }
        return true;
    }
}
public class testRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x,y,w,h;
        System.out.print("Enter r1's center x,y-coordinate, width and height: ");
        x = input.nextDouble();
        y = input.nextDouble();
        w = input.nextDouble();
        h = input.nextDouble();
        Rectangle r1 = new Rectangle(x,y,w,h);
        System.out.print("Enter r2's center x,y-coordinate, width and height: ");
        x = input.nextDouble();
        y = input.nextDouble();
        w = input.nextDouble();
        h = input.nextDouble();
        Rectangle obj = new Rectangle(x,y,w,h);
        
        if(obj.IsInside(r1)){
            System.out.println("r2 is inside r1");
        }
        else{
            System.out.println("r2 is not inside r1");
        }
    }
}
