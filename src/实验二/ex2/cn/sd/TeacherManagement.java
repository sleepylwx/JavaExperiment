package 实验二.ex2.cn.sd;

import 实验二.ex2.cn.net.sdkd.Teacher;

/**
 * Created by 36249 on 2016/10/21.
 */
public class TeacherManagement {

    public static String search(Teacher teachers[],int age){


        for(Teacher i : teachers){

            if(i.getAge() == age){

                return i.toString();
            }
        }
        return "没有符合条件的教师";
    }
}
