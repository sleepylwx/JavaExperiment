package 实验四.ex2.util;

/**
 * Created by 36249 on 2016/11/18.
 */
public class Goods {

    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode(){

        int res = 0;
        for(int i = 0; i < name.length();++i){

            res += name.charAt(i)*7;
        }
        res += price * 11;

        return res;
    }

    @Override
    public boolean equals(Object object){

        if(object == null){

            return false;
        }
        if(object.getClass() != Goods.class){

            return false;
        }
        if(this == object){

            return true;
        }
        Goods o2 = (Goods)object;
        if(name.equals(o2.getName()) && price == o2.getPrice()){

            return true;
        }
        else{

            return false;
        }
    }
}
