package 实验五.ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 36249 on 2016/12/1.
 */
public class Test {

    public static void main(String[] args) {

        List<String> orders = new ArrayList<>();
        List<String> prices = new ArrayList<>();
        Map<String,Integer> pricesMap = new HashMap<>();
        Map<String,Integer> numsMap = new HashMap<>();
        String temp;
        try{

            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("orders.txt")
            );

            while((temp = bufferedReader.readLine()) != null){

                orders.add(temp);
            }

            bufferedReader = new BufferedReader(
                    new FileReader("dished.txt")
            );

            while((temp = bufferedReader.readLine()) != null){

                prices.add(temp);
            }

            bufferedReader.close();

            String[] nameAndNum;
            for(int i = 0; i < orders.size() ; ++i){

                nameAndNum = orders.get(i).split(",");
                for(int j = 0; j < nameAndNum.length; ++j){

                    String[] pair = nameAndNum[j].split(":");
                    if(numsMap.containsKey(pair[0])){

                        numsMap.put(pair[0],numsMap.get(pair[0]) + Integer.valueOf(pair[1]));
                    }
                    else{

                        numsMap.put(pair[0],Integer.valueOf(pair[1]));
                    }

                }
            }

            for(int i = 0; i < prices.size() ; ++i){

                String[] nameAndPrice = prices.get(i).split(":");

                if(pricesMap.containsKey(nameAndPrice[0])){

                    pricesMap.put(nameAndPrice[0],pricesMap.get(nameAndPrice[0]) +
                                    Integer.valueOf(nameAndPrice[1]));
                }
                else{

                    pricesMap.put(nameAndPrice[0],Integer.valueOf(nameAndPrice[1]));
                }

            }

            long res = 0;
            for(Map.Entry<String,Integer> i : numsMap.entrySet()){

                res += i.getValue() * pricesMap.get(i.getKey());
            }

            System.out.println(res);
        }
        catch (IOException e){

            e.printStackTrace();
        }


    }
}
