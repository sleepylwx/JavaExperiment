package 实验二.ex5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by 36249 on 2016/10/21.
 */
public class SearchTest {
    public static void main(String[] args) {

        int [] a = new int[10];
        Random b = new Random();
        for(int i = 0; i < 10 ; ++i){
            a[i] = b.nextInt(100);
        }
        a[9] = 25;
        Arrays.sort(a);
        for(int i : a){
            System.out.println(i);
        }
        System.out.println(SearchAndSort.binarySearchForIteration(a,25));

    }
}
