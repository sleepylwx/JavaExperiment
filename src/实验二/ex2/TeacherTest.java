package 实验二.ex2;

import 实验二.ex2.cn.net.sdkd.Teacher;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by 36249 on 2016/10/21.
 */
public class TeacherTest {

    public static void main(String[] args) {

        Teacher teacher = new Teacher(12,"李四",24,"计算机学院");
        Teacher teacher1 = new Teacher(7,"王五",25,"计算机学院");
        Teacher teacher2 = new Teacher(23,"mike",26,"computer");
        System.out.println(teacher);
        System.out.println(teacher.equals(teacher1));
        Teacher array[] = new Teacher[3];
        array[0] = teacher;
        array[1] = teacher1;
        //array[2] = teacher2;
        Arrays.sort(array, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {

                if(o1 == null|| o2 == null){
                    return 1;
                }
                if(o1.getNumber() < o2.getNumber()){
                    return -1;
                }
                else if(o1.getNumber() == o2.getNumber()){
                    return 0;
                }
                else
                    return 1;
            }
        });
        for(Teacher i : array){

            System.out.println(i);
        }

    }
}
