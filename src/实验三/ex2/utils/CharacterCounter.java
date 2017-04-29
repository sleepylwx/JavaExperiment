package 实验三.ex2.utils;

/**
 * Created by 36249 on 2016/11/11.
 */
public class CharacterCounter {


    public static Triad getUpperAndLowerAndNonEnglishNum(String str){

        Triad triad = new Triad();
        int upperNums = 0;
        int lowerNums = 0;
        int nonEnglishNums = 0;
        for(int i = 0 ; i < str.length() ; ++i){

            if(Character.isUpperCase(str.charAt(i))){

                ++upperNums;
            }
            else if(Character.isLowerCase(str.charAt(i))){

                ++lowerNums;
            }
            else if(!Character.isLetter(str.charAt(i))){

                ++nonEnglishNums;
            }

        }

        triad.setUpperNums(upperNums);
        triad.setLowerNums(lowerNums);
        triad.setNonEnglishNums(nonEnglishNums);

        return triad;
    }
}
