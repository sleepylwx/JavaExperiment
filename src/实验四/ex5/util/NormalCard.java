package 实验四.ex5.util;

/**
 * Created by 36249 on 2016/11/20.
 */
public class NormalCard extends BaseCard{

    private byte color;



    public NormalCard(int color,int num){

            this.color = (byte) color;
            this.setNum((byte) num);
    }


    public byte getColor(){

        return this.color;
    }

    @Override
    public boolean isBoss(){

        return false;
    }





    public boolean equals(NormalCard card){

        if(color == card.color && getNum() == card.getNum()){

            return true;
        }

        return false;
    }
}
