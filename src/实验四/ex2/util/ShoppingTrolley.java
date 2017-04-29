package 实验四.ex2.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 36249 on 2016/11/18.
 */
public class ShoppingTrolley {

    private Map<Goods,Integer> shoppingTrolley;

    public ShoppingTrolley(){

        shoppingTrolley = new HashMap<>();
    }

    public void add(Goods goods,int num){

        int temp = 0;
        if(shoppingTrolley.containsKey(goods)){

            temp = shoppingTrolley.get(goods);
        }

        shoppingTrolley.put(goods,temp + num);
    }

    public int getSum(){

        return getSum(shoppingTrolley);
    }

    private int getSum(Map<Goods,Integer> shoppingTrolley){

        int res = 0;
        for(Map.Entry<Goods,Integer> entry : shoppingTrolley.entrySet()){

            res += entry.getKey().getPrice() * entry.getValue();
        }

        return res;
    }
}
