package com.java.practice.pro.Day3;

public class Arrays {
    //
    public static void main(String args[]) {
        String Name[] = {"Guru", "Deepak", "ravi", "vital", "k.raja"};
        for (String nam : Name) {

            /**/
            String name = nam.toLowerCase();

                if (name.equals("deepak"))
                {
                    System.out.println("Name " + name + "  is found in the list  ");
                }

                else if (name.startsWith("r"))
                {
                    System.out.println("Name " + name + "  Start with letter r  ");
                }

                else if (name.endsWith("u"))
                {
                    System.out.println("Name " + name + "  Ends with letter u  ");
                }

                else if (name.contains("it"))
                {
                    System.out.println("Name " + name + "  contains with letter it  ");
                }

                else
                {
                    System.out.println(name + "  is not found in the list ");
                }
        }
    }
}
