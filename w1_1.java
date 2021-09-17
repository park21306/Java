package javaapplication3;

class Complex {
private double r, i;
Complex(double r, double i) {
this.r = r; this.i = i;
}
Complex(Complex c) {
this(c.r, c.i);
}
public void add(Complex c) {
r += c.r;
i += c.i;
}
public void reduce(Complex c) {
r -= c.r;
i -= c.i;
}
public void vec(Complex c) {
r = (this.r*c.r)-(this.i*c.i);
i = (this.r*c.i)-(this.i*c.r);
}
public void loot(Complex c) {
double p=0,o=0;
o = (((this.r*c.r)+(this.i*c.i))/(Math.pow(c.r,2)+(Math.pow(c.i,2))));
p = (((this.i*c.r)-(this.r*c.i))/(Math.pow(c.r,2)+(Math.pow(c.i,2))));
r = o;
i = p;        
}
public void print() {
System.out.println(r + "+ i" + i);
}

}
class ComplexTest {
public static void main(String args[]) {
Complex a = new Complex(1.0, 2.0);
Complex b = new Complex(3.0, 4.0);
Complex c = new Complex(a);
//c.reduce(b);
//c.print();
//c.add(b);
//c.print();
//c.vec(b);
//c.print();
c.loot(b);
c.print();
}
}
