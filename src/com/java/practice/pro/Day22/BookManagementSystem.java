package com.java.practice.pro.Day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
    private int id;
    private String tittle;
    private String author;

 /*   public Book() {

    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   /* @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                '}';
    }*/
}


public class BookManagementSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Book> obj = new ArrayList();


        while (true) {

            System.out.println("1.Add Book :" );
            System.out.println("2.list..");
            System.out.println("enter your choice...");

            int choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter the book ID : ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter the tittle of the book : ");
                    String tittle = input.nextLine();

                    System.out.println("Enter the book Author : ");
                    String author = input.nextLine();

                    Book book = new Book();

                    book.setId(id);
                    book.setTittle(tittle);
                    book.setAuthor(author);

                    obj.add(book);

                    System.out.println("added....");

                    break;

                case 2:

                   if (obj.isEmpty()){
                        System.out.println("no book in  the list....");
                    }else {
                        for (Book res : obj){
                            System.out.println(res);
                        }
                    }




            }
        }


    }
}
