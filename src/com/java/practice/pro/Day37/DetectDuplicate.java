package com.java.practice.pro.Day37;
// detected the duplicate in the array

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DetectDuplicate {

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

            HashSet<Integer> remove_dup = new HashSet<>();
            ArrayList<Integer> duplicate = new ArrayList<>();

            for(Integer num : list){
                if(!remove_dup.add(num)){
                    duplicate.add(num);
                }
            }
            System.out.println(duplicate);

        }
    }


