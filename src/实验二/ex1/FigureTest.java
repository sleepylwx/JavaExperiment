package 实验二.ex1;

import 实验二.ex1.figure.Circle;
import 实验二.ex1.figure.Figure;
import 实验二.ex1.figure.Rectangle;
import 实验二.ex1.figure.Triangle;

/**
 * Created by 36249 on 2016/10/21.
 */
public class FigureTest {

    public static void main(String[] args) {

        Figure figure1 = new Rectangle(10,20);
        Figure figure2 = new Circle(5);
        Figure figure3 = new Triangle(3,4,5);

        System.out.println(figure1.getCircumference()+" " + figure1.getArea());
        System.out.println(figure2.getCircumference()+" " + figure2.getArea());
        System.out.println(figure3.getCircumference()+" " + figure3.getArea());


    }
}
