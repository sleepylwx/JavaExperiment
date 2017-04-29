package 实验三.ex3;

import 实验三.ex3.utils.RandomTeacher;

/**
 * Created by 36249 on 2016/11/11.
 */
public class RandomTeacherTest {

    public static void main(String[] args) {

        String[] teachers = {"Mike","Tom","Holy","Yelk","Eallisnise",
                                "张三","李四","王五"};

        String[] randomTeachers = RandomTeacher.getRandomTeachers(teachers,3);
        for(String str : randomTeachers){

            System.out.println(str);
        }
    }
}
