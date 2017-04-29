package 实验五.ex5.util;

import java.io.Serializable;

/**
 * Created by 36249 on 2016/12/1.
 */
public class Student implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String subject;
    private int grade;

    public Student(int id, String name, String subject, int grade) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


}
