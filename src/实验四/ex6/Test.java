package 实验四.ex6;

import 实验四.ex6.util.XDatabase;
import 实验四.ex6.util.Xman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 36249 on 2016/11/21.
 */
public class Test {

    public static void main(String[] args) {

        List<Xman> list1 = new ArrayList<>();
        List<Xman> list2 = new ArrayList<>();
        List<Xman> list3 = new ArrayList<>();
        Xman lisi = new Xman("李四","lisi","隐身","跑得慢",list1,null,"男","ADATC");
        Xman zhangsan = new Xman("张三","zhangsan","飞行","没伤害",list2,null,"男","ADDDDTC");
        Xman wangwu = new Xman("王五","wangwu","高暴击","低生存",list3,null,"男","TDADATC");

        list1.add(zhangsan);
        list2.add(lisi);
        list3.add(zhangsan);
        XDatabase db = new XDatabase(100);
        db.add(zhangsan);
        db.add(lisi);
        db.add(wangwu);

        List<Xman> temp = db.friends(lisi.getDNASequence());

        for(Xman i : temp){

            System.out.println(i.getName());
        }


        List<Xman> temp1 = db.partner(lisi.getName());

        for(Xman i : temp1){

            System.out.println(i.getName());
        }

        List<Xman> temp2 = db.archrival(lisi.getName());

        for(Xman i : temp2){

            System.out.println(i.getName());
        }




    }


}