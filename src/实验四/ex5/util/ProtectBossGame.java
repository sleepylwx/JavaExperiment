package 实验四.ex5.util;

import java.util.List;
import java.util.Random;

/**
 * Created by 36249 on 2016/11/20.
 */
public class ProtectBossGame {

    private Player[] players;
    private byte bossCardNum;
    private NormalCard bodyGuardCard;
    private CardHeap cardHeap;
    private byte bossNum;
    public ProtectBossGame(){

        Random random = new Random();
        this.bossCardNum = (byte)(random.nextInt(4) + 1);
        players = new Player[5];
        for(int i = 0; i < 5; ++i){

            players[i] = new Player((byte)(i+1));

        }
        cardHeap = new CardHeap();
        allocateCardToPlayers(cardHeap);
    }
    public Player getBoss(){

        for(int i = 0; i < 5; ++i){

            if(players[i].hasBossCard(bossCardNum)){
                bossNum = (byte) i;

                return players[i];
            }
        }

        return null;
    }
    public void setBodyGuardCard(NormalCard card){

        this.bodyGuardCard = card;
    }

    public NormalCard getBodyGuardCard(){

        return this.bodyGuardCard;
    }

    public Player getBodyGuard(){

        for(int i = 0 ; i < 5; ++i){


            if(players[i].hasBodyGuardCard(bodyGuardCard,i+1)){

                return players[i];
            }
        }

        return null;
    }

    private void allocateCardToPlayers(CardHeap cardHeap){

        List<BaseCard> cards = cardHeap.getRandomCards();
        int cur = 0;
        Random random = new Random();
        int i = random.nextInt(5);
        int j = i + 5;
        while(cur < 216){

            for(; i < j ; ++i){

                if(cur == 216){
                    break;
                }
                players[i%5].addCard(cards.get(cur++));
            }
            i = j - 5;
        }

    }
}
