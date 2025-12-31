package com.java.practice.pro.Day36;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class HashsetExample {
    public static <iterator> void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicango");
        cities.add("New York");

        System.out.println("Cities: "+cities);

        cities.remove("Chicago");
        System.out.println("After removal"+cities);

        //Important methods in Hashset
        hashSetMethods();
        // Iterator
        iteratorInHashSet();
    }



    public static void hashSetMethods(){
        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1,3,2,4,8,9,0));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(1,3,7,5,4,0,7,5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union of the two sets : ");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Interaction of the two sets : ");
        System.out.println(intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two sets : ");
        System.out.println(difference);
    }
    public static void iteratorInHashSet(){
        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(1,3,2,4,8,9,0));

        Iterator<Integer> iterator = a.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
