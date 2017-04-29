package 实验二.ex8;

/**
 * Created by 36249 on 2016/10/21.
 */
public class MatrixTest {

    public static void main(String[] args) {
        Matrix a = new Matrix(10,20);

        Matrix.ThreeObject b  = a.getMax();

        System.out.println(b.getValue());
    }
}
