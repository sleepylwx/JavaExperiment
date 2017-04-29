package 实验三.ex1.utils;

/**
 * Created by 36249 on 2016/11/11.
 */
public class PalindromicNumber {


    public static boolean IsPalindromicNumber(int num){

        String strNum = String.valueOf(num);
        StringBuffer stringBuffer = new StringBuffer(strNum);
        String inverseStrNum = stringBuffer.reverse().toString();

        if(strNum.equals(inverseStrNum)){

            return true;
        }

        else{

            return false;
        }
    }


    public static int getNumberBits(int num){


        return String.valueOf(num).length();
//        int res = 0;
//        while(num != 0){
//
//            num /= 10;
//            ++res;
//        }
//
//        return res;
    }
}
