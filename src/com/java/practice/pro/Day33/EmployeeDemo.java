package com.java.practice.pro.Day33;


import java.util.HashMap;

    public class EmployeeDemo {

        public static void main(String[] args) {
            // Step 1: Create Employee objects
            Employee e1 = new Employee(101, "Ragu", 50000);
            Employee e2 = new Employee(102, "Emma", 60000);
            Employee e3 = new Employee(103, "John", 55000);
            Employee e4 = new Employee(104, "Sophia", 65000);
            Employee e5 = new Employee(105, "David", 70000);
           /* Employee e6 = new Employee(106, "Liam", 72000);
            Employee e7 = new Employee(107, "Olivia", 68000);
            Employee e8 = new Employee(108, "Noah", 64000);
            Employee e9 = new Employee(109, "Ava", 75000);
            Employee e10 = new Employee(110,"Ethan", 71000);*/

            // Step 2: Store in HashMap (id → Employee object)
            HashMap<Integer, Employee> employeeMap = new HashMap<>();
            employeeMap.put(e1.id, e1);
            employeeMap.put(e2.id, e2);
            employeeMap.put(e3.id, e3);
            employeeMap.put(e4.id, e4);
            employeeMap.put(e5.id, e5);


            // Step 3: Print all employees
            for(Integer IDS : employeeMap.keySet()){
                Employee emp = employeeMap.get(IDS);  // get the Employee object by key
                emp.display();  // call display() to print details
            }


        }
    }

