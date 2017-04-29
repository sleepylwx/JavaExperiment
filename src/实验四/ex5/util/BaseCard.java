package 实验四.ex5.util;

/**
 * Created by 36249 on 2016/11/20.
 */
public abstract class BaseCard {

    private byte num;




    public abstract boolean isBoss();

    public byte getNum() {
        return num;
    }

    protected void setNum(byte num) {
        this.num = num;
    }






}
