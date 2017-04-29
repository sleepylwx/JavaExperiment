package 实验三.ex4;

import 实验三.ex4.utils.FoodTable;

/**
 * Created by 36249 on 2016/11/11.
 */
public class FoodTableTest {

    public static void main(String[] args) {

        String str = "北京烤鸭:189 西芹百合:15 清蒸鲈鱼:80";
        String[] temp = FoodTable.getFoodPriceTable(str);
        for(String i : temp){

            System.out.println(i);
        }
        System.out.println(FoodTable.getPriceSum(str));
    }
}
