package 实验三.ex2;

import com.sun.org.apache.xpath.internal.SourceTree;
import 实验三.ex2.utils.CharacterCounter;
import 实验三.ex2.utils.Triad;

import java.util.Scanner;

/**
 * Created by 36249 on 2016/11/11.
 */
public class CharacterNumsTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Triad triad = CharacterCounter.getUpperAndLowerAndNonEnglishNum(str);
        System.out.println("Upper: " + triad.getUpperNums());
        System.out.println("Lower: " + triad.getLowerNums());
        System.out.println("NonEnglish: " + triad.getNonEnglishNums());
    }
}
