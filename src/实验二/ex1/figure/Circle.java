package 实验二.ex1.figure;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Circle extends  Figure {

    private double r;
    private static final double PI = 3.14;
    public Circle(double r) {
        this.r = r;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea(){

        return PI*r*r;
    }

    @Override
    public double getCircumference(){

        return 2*PI*r;
    }


}
