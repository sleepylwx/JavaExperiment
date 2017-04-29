package 实验四.ex5.util;

/**
 * Created by 36249 on 2016/11/20.
 */
public class BossCard extends BaseCard {

    byte index;

    public BossCard(int num,int index){

        this.index = (byte)index;
        this.setNum((byte)num);

    }

    @Override
    public boolean isBoss(){

        return true;
    }

    public byte getIndex(){

        return index;
    }
}
