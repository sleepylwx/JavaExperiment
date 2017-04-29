package 实验二.ex2.cn.net.sdkd;

/**
 * Created by 36249 on 2016/10/21.
 */
public class Teacher implements Comparable<Teacher>{

    private int number;
    private String name;
    private int age;
    private String seminary;

    public Teacher(int number, String name, int age, String seminary) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.seminary = seminary;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeminary() {
        return seminary;
    }

    public void setSeminary(String seminary) {
        this.seminary = seminary;
    }

    @Override
    public boolean equals(Object object){

        if(this.getClass() == object.getClass()){

            return this.number == ((Teacher) object).number;
        }
        return false;
    }
    @Override
    public String toString(){

        return "编号为"+number+"、姓名为"+name+"、年龄为"+age+"的"+seminary+"学院老师";
    }

    @Override
    public int compareTo(Teacher object){

        if(this.number < object.number){
            return -1;
        }
        else if(this.number == object.number){
            return 0;
        }
        else
            return 1;
    }

}
