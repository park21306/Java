package javaapplication3;

class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x,y;
    RegularPolygon(){
       this.x = 0;
       this.y = 0;
    }
    RegularPolygon(int n,double side){
     this.n=n;
     this.side=side;
     
    } 
    RegularPolygon(int n,double side,double x,double y){
     this.n= n;
     this.side=side;
     this.x = x;
     this.y = y;
     
   }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return (n*Math.pow(side,2))/(4*(Math.tan(Math.PI/n)));
    }
    
}
class testRegularPolygon {    
    public static void main(String[] args) {
        RegularPolygon a = new RegularPolygon();
        RegularPolygon b = new RegularPolygon(6,4);
        RegularPolygon c = new RegularPolygon(10,4,5.6,7.8);
        double a1,a2,b1,b2,c1,c2;
        a1 = a.getArea();
        a2 = a.getPerimeter();
        b1 = b.getArea();
        b2 = b.getPerimeter();
        c1 = c.getArea();
        c2 = c.getPerimeter();
        System.out.print(a1+" "+a2);
        System.out.print(b1+" "+b2);  
        System.out.print(c1+" "+c2);
    }      
}