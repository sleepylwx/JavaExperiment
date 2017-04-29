package 实验三.ex4.utils;

import java.util.IntSummaryStatistics;

/**
 * Created by 36249 on 2016/11/11.
 */
public class FoodTable {

    /**
     *
     * @param str must be splited by : nor by ：
     */
    public static String[] getFoodPriceTable(String str){


        return str.split(" ");
    }
    public static int getPriceSum(String str){

        String[] temp = str.split(" ");
        int result = 0;
        for(int i = 0; i < temp.length;++i){

            result += Integer.valueOf(temp[i].split(":")[1]);
        }
        return result;
    }
}
