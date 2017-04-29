package 实验四.ex5.util;

import java.util.*;

/**
 * Created by 36249 on 2016/11/20.
 */
public class CardHeap {

    private List<BaseCard> cards;
    public  CardHeap(){


        cards = new ArrayList<>();


        for(int i = 0; i < 4;++i){

            for(int j = 0; j < 4; ++j){

                for(int k = 1; k < 14; ++k){

                    cards.add(new NormalCard(j,k));
                }

            }
            cards.add(new BossCard(14,i+1));
            cards.add(new BossCard(15,i+1));
        }

    }

    public List<BaseCard> getRandomCards(){

        Collections.shuffle(cards);
        return cards;
    }
}
