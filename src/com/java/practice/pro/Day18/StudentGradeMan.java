package com.java.practice.pro.Day18;


import java.util.Scanner;

abstract class Stu{
    abstract void calculateGrade();
    abstract void displayDetail();

}

class Stu_detail extends  Stu{

    private String name;
    private int rollNo;
    private int marks;
    private String grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }



    @Override
    void calculateGrade() {

        if(marks >=90 && marks <=100 ){
            grade = "a";
        } else if (marks>=80) {
            grade = "b";
        } else if(marks >= 70){
            grade = "c";
        } else if(marks >= 60){
            grade = "e";
        } else{
            grade="fail";
        }
        //System.out.println("Grade yuigu " +getGrade());

    }

    @Override
    void displayDetail() {

        System.out.println("Student Name : " +getName());
        System.out.println("student RollNO : " +getRollNo());
        System.out.println("Mark is : " +getMarks());
        System.out.println("Grade : " +getGrade());
    }


}


public class StudentGradeMan {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);



        System.out.println("Enter the name : " );
        String Name = inp.nextLine();

        System.out.println("Enter the rollNo : " );
        int RollNo = inp.nextInt();

        System.out.println("Enter the mark : ");
        int Marks = inp.nextInt();


        Stu_detail obj1 = new Stu_detail();
        obj1.setName(Name);
        obj1.setRollNo(RollNo);
        obj1.setMarks(Marks);


        obj1.calculateGrade();
        obj1.displayDetail();


    }
}

