package 实验四.ex3;

import java.util.*;

/**
 * Created by 36249 on 2016/11/18.
 */
public class Test {

    /**
     *  随机数用Random类即可，这里需要判重，所以用hashMap<Integer,Boolean></>存储已经生成的随机数
     *  用hashMap是因为可以用map的值来标记在猜奖中，这个数字是否已经猜中,默认是false，没有猜中
     *  猜中后，标记为true
     *  用户输入7个数字，判断每一个数字是否出现在hashMap中，并且没有被访问，然后增加计数器
     *  最后根据计数器来判断奖励情况
     */
    public static void main(String[] args) {

        Map<Integer,Boolean> numArray = new HashMap<>();
        Random random = new Random();
        for(int i = 0; i < 7 ; ++i){

            int num;
            while(true){

                num = random.nextInt(30)+1;
                if(!numArray.containsKey(num)){

                    break;
                }

            }

            numArray.put(num,false);
        }


        System.out.println("请输入7个数：");
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        for(int i = 0; i < 7;++i){

            int temp = scanner.nextInt();
            if(numArray.containsKey(temp) && numArray.get(temp) == false){

                ++res;
                numArray.put(temp,true);
            }

        }

        if(res == 7){

            System.out.println("您中了一等奖");
        }
        else if(res == 6){

            System.out.println("您中了二等奖");
        }
        else if(res == 5){

            System.out.println("您中了三等奖");
        }
        else{

            System.out.println("您没有获奖，再接再厉");
        }

    }
}
