package 实验三.ex5;

/**
 * Created by 36249 on 2016/11/11.
 */
public class DyadicArrayTest {

    public static void main(String[] args) {

        double[][] temp = DyadicArray.getDyadicArray("1,2;3,4,5;6,7,8");

        for(double[] i : temp){

            for(double j : i){

                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
