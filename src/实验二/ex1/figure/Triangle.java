package 实验二.ex1.figure;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Triangle extends  Figure {

    private double a;
    private double b;
    private double c;
    private double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p =  (a+b+c)/2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getCircumference(){
        return a + b + c;
    }
    @Override
    public double getArea(){

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
