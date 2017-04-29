package 实验三.ex3.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * Created by 36249 on 2016/11/11.
 */
public class RandomTeacher {


    public static String[] getRandomTeachers(String[] teachers,int n){


        Random random = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        String[] randomTeachers = new String[n];
        int cur = 0;
        int num = -1;
        while(cur < n){

            num = random.nextInt(teachers.length);
            if(hashSet.contains(num)){

                continue;
            }
            else{

                hashSet.add(num);
                randomTeachers[cur++] = teachers[num];
            }

        }
        return randomTeachers;
    }
}
