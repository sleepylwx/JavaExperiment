package 实验三.ex1;

import 实验三.ex1.utils.PalindromicNumber;

import java.util.Scanner;

/**
 * Created by 36249 on 2016/11/11.
 */
public class PalindromeTest {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(PalindromicNumber.getNumberBits(num));

        if(PalindromicNumber.IsPalindromicNumber(num)){

            System.out.println("是回文数");
        }
        else{

            System.out.println("不是回文数");
        }
    }
}
