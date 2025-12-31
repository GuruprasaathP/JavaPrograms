package com.java.practice.pro.Day24;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employ{
    private int Employee_Id;
    private String Employee_Name;
    private String Employee_Address;
    private int Employee_PhoneNo;

    public int getEmployee_Id() {
        return Employee_Id;
    }

    public void setEmployee_Id(int employee_Id) {
        Employee_Id = employee_Id;
    }

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        Employee_Name = employee_Name;
    }

    public int getEmployee_PhoneNo() {
        return Employee_PhoneNo;
    }

    public void setEmployee_PhoneNo(int employee_PhoneNo) {
        Employee_PhoneNo = employee_PhoneNo;
    }

    public String getEmployee_Address() {
        return Employee_Address;
    }

    public void setEmployee_Address(String employee_Address) {
        Employee_Address = employee_Address;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "Employee_Id=" + Employee_Id +
                ", Employee_Name='" + Employee_Name + '\'' +
                ", Employee_Address='" + Employee_Address + '\'' +
                ", Employee_PhoneNo=" + Employee_PhoneNo +
                '}';
    }
}



public class Employee {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Employ> obj = new ArrayList();

        while(true){

            System.out.println("Enter the Employee add  Select option 1 ....");
            System.out.println("Enter the Employee removed Selection  option 2 ....");
            System.out.print("Enter the choice .....  ");

            int Choice = input.nextInt();

            switch (Choice){
                case 1 :

                    System.out.println("Enter the Employee ID : " );
                    int  employee_Id = input.nextInt();

                    input.nextLine();

                    System.out.println("Enter the Employee Name : ");
                    String employee_Name = input.nextLine();

                    System.out.println("Enter the Employee Address : ");
                    String employee_Address = input.nextLine();

                    System.out.println("Enter the Employee Phone No : ");
                    int employee_PhoneNo = input.nextInt();

                    Employ emp = new Employ(); // creating the object for the class Employ class

                    emp.setEmployee_Id(employee_Id);
                    emp.setEmployee_Name(employee_Name);         // in this we have to get and set the input from user and
                    emp.setEmployee_Address(employee_Address);   // after creating the object for the class employ
                    emp.setEmployee_PhoneNo(employee_PhoneNo);

                    obj.add(emp);  // now we have to add the value holding object emp to the array list object obj

                    break;

                case 2 :
                    if(obj.isEmpty()){
                        System.out.println("No employees are Present.");
                    }
                    else{

                        for( Employ res : obj){
                            System.out.println(res);
                        }
                    }






            }
        }

    }


}
