package 实验二.ex1.figure;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Rectangle extends Figure {


    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getCircumference(){

        return 2*(length+width);
    }
    @Override
    public double getArea(){

        return length*width;
    }
}
