package 实验四.ex4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by 36249 on 2016/11/18.
 */
public class Test {




    public static void main(String[] args) {

        Set<String> setA;
        Set<String> setB;

        setA = new HashSet<>();
        setB = new HashSet<>();

        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个集合的元素(输入N完成输入)：");
        while(true){

            temp = scanner.next();
            if(temp.equalsIgnoreCase("N")){

                break;
            }
            setA.add(temp);
        }

        System.out.println("请输入第二个集合的元素(输入N完成输入): ");
        while(true){

            temp = scanner.next();
            if(temp.equalsIgnoreCase("N")){

                break;
            }

            setB.add(temp);
        }
        Iterator<String> iteratorA = setA.iterator();

        while(iteratorA.hasNext()){

            Iterator<String> iteratorB = setB.iterator();
            String strA = iteratorA.next();
            while(iteratorB.hasNext()){

                System.out.println("<" + strA + "," + iteratorB.next() + ">");

            }

        }
    }
}
