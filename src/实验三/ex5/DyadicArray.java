package 实验三.ex5;

/**
 * Created by 36249 on 2016/11/11.
 */
public class DyadicArray {

    public static double[][] getDyadicArray(String str){

        String[] temp1 = str.split(";");
        String[] temp2;
        double[][] array = new double[temp1.length][];
        for(int i = 0; i < temp1.length; ++i){

            temp2 = temp1[i].split(",");
            array[i] = new double[temp2.length];
            for(int j = 0; j < temp2.length; ++j){

                array[i][j] = Integer.valueOf(temp2[j]);
            }
        }

        return array;
    }
}
