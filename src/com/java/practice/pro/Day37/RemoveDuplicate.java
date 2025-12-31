package com.java.practice.pro.Day37;
// how to remove the duplicate in the list

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println(list);

        HashSet<Integer>remove_dup = new HashSet<>(list);

            System.out.print(remove_dup);

    }
}
