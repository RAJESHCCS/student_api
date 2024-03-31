package com.student.student.Studentmodel;

public class Student {
    String id;
    String name;
    int rollno;
    public  Student(){

    }
    public Student(String id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


}
