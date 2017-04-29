package 实验四.ex2;

import 实验四.ex2.util.Goods;
import 实验四.ex2.util.ShoppingTrolley;

import java.util.Scanner;

/**
 * Created by 36249 on 2016/11/18.
 */
public class Test {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入n表示接下来要输入的n个货物：");
        n = scanner.nextInt();
        ShoppingTrolley shoppingTrolley = new ShoppingTrolley();

        for(int i = 0; i < n ; ++i){

            String name;
            int price;
            int num;
            name = scanner.next();
            price = scanner.nextInt();
            num = scanner.nextInt();

            shoppingTrolley.add(new Goods(name,price),num);
        }

        System.out.println(shoppingTrolley.getSum());
    }
}
