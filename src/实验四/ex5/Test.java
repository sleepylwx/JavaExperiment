package 实验四.ex5;

import 实验四.ex5.util.BaseCard;
import 实验四.ex5.util.NormalCard;
import 实验四.ex5.util.ProtectBossGame;
import 实验四.ex5.util.Player;

import java.util.*;

/**
 * Created by 36249 on 2016/11/20.
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProtectBossGame game = new ProtectBossGame();

        Player boss = game.getBoss();
        String bossStr = "皇帝是：" + "玩家" + boss.getIndex()
                + "\n" + "皇帝的牌是：[" + getCardsStr(boss.getCurrentCards()) + "]";
        System.out.println(bossStr);

        System.out.println("请皇上选择三张相同花色相同数字的侍卫牌(如：红桃3)：");
        String temp = scanner.next();
        byte color = getColor(temp);
        byte num = getNum(temp);
        NormalCard card1 = new NormalCard(color,num);
        game.setBodyGuardCard(card1);
        NormalCard bodyGuardCard = game.getBodyGuardCard();
        List<BaseCard> listTemp = new ArrayList<>();
        listTemp.add(bodyGuardCard);
        System.out.println("侍卫对应的牌是：" + getCardsStr(listTemp));

        Player playerBodyGuard = game.getBodyGuard();
        String bodyGuardStr = "侍卫是：" + "玩家" + playerBodyGuard.getIndex()+"\n"
                +"侍卫的牌是：[" + getCardsStr(playerBodyGuard.getCurrentCards())+"]";
        System.out.println(bodyGuardStr);

    }

    public static byte getColor(String str){

        byte color;

        String cardColor = str.substring(0,2);
        if(cardColor.equals("红桃")){

            color = 1;
        }
        else if(cardColor.equals("黑桃")){

            color = 2;
        }
        else if(cardColor.equals("方块")){

            color = 3;
        }
        else{

            color = 4;
        }

        return color;
    }

    public static byte getNum(String str){

        byte num;
        String cardNum = str.substring(2,str.length());

        if(cardNum.equals("A")){

            num = 1;
        }
        else if(cardNum.equals("J")){

            num = 11;
        }
        else if(cardNum.equals("Q")){

            num = 12;
        }
        else if(cardNum.equals("K")){

            num = 13;
        }
        else if(cardNum.equals("小王")){

            num = 14;
        }
        else if(cardNum.equals("大王")){

            num = 15;
        }
        else{

            num = Byte.valueOf(cardNum);
        }

        return num;
    }

    public static String cardColorByteToString(byte cardColor){

        String color;
        if(cardColor == 1){

            color = "红桃";
        }
        else if(cardColor == 2) {

            color = "黑桃";
        }
        else if(cardColor == 3){

            color = "方块";
        }
        else{

            color = "梅花";
        }
        return color;
    }

    public static String cardNumByteToString(byte cardNum){

        String num;
        if(cardNum == 11){

            num = "J";
        }
        else if(cardNum == 12){

            num = "Q";
        }
        else if(cardNum == 13){

            num = "K";
        }
        else if(cardNum == 1){

            num = "A";
        }
        else if(cardNum == 14){

            num = "小王";
        }
        else if(cardNum == 15){

            num = "大王";
        }
        else{

            num = String.valueOf(cardNum);
        }

        return num;
    }

    public static String getCardsStr(List<BaseCard> cards){

        Collections.sort(cards, new Comparator<BaseCard>() {
            @Override
            public int compare(BaseCard o1, BaseCard o2) {

                if(o1.getNum() == o2.getNum()){

                    if(o1.isBoss() && o2.isBoss()){

                        return 0;
                    }
                    else if(o1.isBoss() && !o2.isBoss()){

                        return -1;
                    }
                    else if(!o1.isBoss() && o2.isBoss()){

                        return 1;
                    }
                    else{
                        NormalCard temp1 = (NormalCard)o1;
                        NormalCard temp2 = (NormalCard)o2;
                        return -(getColorValue(temp1.getColor()) - getColorValue(temp2.getColor()));
                    }
                }
                else{

                    return -(getNumValue(o1.getNum()) - getNumValue(o2.getNum()));
                }
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < cards.size(); ++i){

            if(cards.get(i).getNum() == (byte)14){

                stringBuffer.append("小王");
            }
            else if(cards.get(i).getNum() == (byte) 15){

                stringBuffer.append("大王");
            }
            else{
                NormalCard temp = (NormalCard)cards.get(i);
                stringBuffer.append(cardColorByteToString(temp.getColor())+
                                        cardNumByteToString(temp.getNum()));
            }
            if(i != (cards.size()-1)){

                stringBuffer.append(", ");
            }
        }

        return stringBuffer.toString();
    }

    public static int getNumValue(byte num){


        if(num == 1){

            return 14;
        }
        else if( num == 2){

            return 15;
        }
        else if( num == 14){

            return 16;
        }
        else if(num == 15){

            return 17;
        }
        else{

            return num;
        }
    }

    public static int getColorValue(byte color){

        return color;
    }
}
