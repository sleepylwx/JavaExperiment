package 实验四.ex6.util;

import java.util.Date;
import java.util.List;

/**
 * Created by 36249 on 2016/11/21.
 */
public class Xman {

    String name;
    String xname;
    String power;
    String weakness;
    List<Xman> enemy;
    Date birthDate;
    String gender;
    String DNASequence;

    public Xman(String name, String xname, String power,
                String weakness, List<Xman> enemy, Date birthDate,
                String gender, String DNASequence) {

        this.name = name;
        this.xname = xname;
        this.power = power;
        this.weakness = weakness;
        this.enemy = enemy;
        this.birthDate = birthDate;
        this.gender = gender;
        this.DNASequence = DNASequence;
    }

    public String getName() {

        return xname+"("+name+")";
    }


    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public List<Xman> getEnemy() {
        return enemy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getDNASequence() {
        return DNASequence;
    }

    @Override
    public boolean equals(Object o){

        if(o == null){

            return false;
        }

        if(o.getClass() != Xman.class){

            return false;
        }

        if(DNASequence.equals(((Xman)o).DNASequence)){

            return true;
        }
        else{

            return false;
        }
    }
}
