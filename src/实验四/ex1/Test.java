package 实验四.ex1;

import 实验四.ex1.util.Student;

import java.util.*;

/**
 * Created by 36249 on 2016/11/18.
 */
public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String isGoOn;
        List<Student> studentList = new ArrayList<>();
        while(true){

            System.out.println("输入Y继续输入信息，输入N完成输入");
            isGoOn = scanner.next();

            if(isGoOn.equalsIgnoreCase("N")){

                break;
            }

            String name;
            int grade;
            name = scanner.next();
            grade = scanner.nextInt();

            studentList.add(new Student(name,grade));
        }

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o2.getGrade() - o1.getGrade();
            }
        });
        for(Student student : studentList){

            System.out.println(student.getName() + " " + student.getGrade());
        }


    }
}
