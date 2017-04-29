package 实验四.ex5.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36249 on 2016/11/20.
 */
public class Player {

    List<BaseCard> currentCards;
    byte index;
    public Player(byte index){

        currentCards = new ArrayList<>();
        this.index = index;
    }

    public byte getIndex() {
        return index;
    }


    public List<BaseCard> getCurrentCards(){

        return currentCards;
    }

    public void addCard(BaseCard card){

        currentCards.add(card);
    }

    public boolean hasBossCard(Byte bossCardNum){

        for(int i = 0; i < currentCards.size(); ++i){


            if(currentCards.get(i).isBoss() && ((BossCard)currentCards.get(i)).getIndex()
                    == bossCardNum){

                return true;
            }
        }

        return false;
    }

    public boolean hasBodyGuardCard(NormalCard card,int index){

        int res = 0;
        for(int i = 0; i < currentCards.size(); ++i){


            if(!currentCards.get(i).isBoss() && ((NormalCard)currentCards.get(i)).equals(card)){

                ++res;
            }

        }

        if(res == 4 && this.index == index){

            return true;
        }
        else if(res == 1){

            return true;
        }
        return false;
    }


}
