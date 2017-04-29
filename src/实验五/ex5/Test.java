package 实验五.ex5;

import 实验五.ex5.util.Student;

import java.io.*;
import java.util.Scanner;

/**
 * Created by 36249 on 2016/12/1.
 */
public class Test {

    private static final int DATSIZEINWINDOWS = 4;
    public static void main(String[] args) throws Exception{

        String readOrWrite;
        Scanner scanner = new Scanner(System.in);






        File file = new File("data.dat");
        int inputTime;
        System.out.println(file.length());
        if(file.length() == DATSIZEINWINDOWS){

            inputTime = 0;
        }
        else{
            inputTime = 1;
        }
        while(true){

            System.out.println("输入 s 保存数据，输入 r 读取数据，输入 其他 退出");
            readOrWrite = scanner.nextLine();

            if(readOrWrite.equalsIgnoreCase("s")){

                int id;
                String name;
                String subject;
                int grade;
                System.out.println("输入学生学号: ");
                id = Integer.valueOf(scanner.nextLine());
                System.out.println("输入学生姓名: ");
                name = scanner.nextLine();
                System.out.println("输入选修课程: ");
                subject = scanner.nextLine();
                System.out.println("输入课程成绩: ");
                grade = Integer.valueOf(scanner.nextLine());
                ObjectOutputStream objectOutputStream;
                if(inputTime == 0){

                    objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream("data.dat",true)
                    );
                    objectOutputStream.writeObject(new Student(
                            id,name,subject,grade
                    ));
                    ++inputTime;


                }
                else{

                    objectOutputStream = new ObjectOutputStream(
                            new FileOutputStream("data.dat",true)
                    ){

                        @Override
                        protected void writeStreamHeader()throws IOException{

                        }
                    };
                    objectOutputStream.writeObject(
                            new Student(id,name,subject,grade)
                    );

                }

                objectOutputStream.flush();
                objectOutputStream.close();

            }
            else if(readOrWrite.equalsIgnoreCase("r")){


                ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("data.dat")
                );

                Student student;

                int cur = 0;

                try{

                    while((student = (Student) objectInputStream.readObject()) != null){


                        ++cur;
                        System.out.println("第" + cur + "个学生:");
                        System.out.println("    学号：" + student.getId());
                        System.out.println("    姓名：" + student.getName());
                        System.out.println("    选修课程：" + student.getSubject());
                        System.out.println("    成绩：" + student.getGrade());
                        System.out.println("");

                    }
                }
                catch (EOFException e){


                }
                finally {

                    objectInputStream.close();
                }

            }
            else{

                break;
            }

        }




    }


}
