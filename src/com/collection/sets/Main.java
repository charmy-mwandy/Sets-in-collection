package com.collection.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
// Java Program Demonstrating Operations on the Set
// such as Union, Intersection and Difference operations

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(
                new Integer[] {1,2,3,4,5}));

        Set<Integer> number = new HashSet<>();
        number.addAll(Arrays.asList(
                new Integer[] {1,7,3,4,5,8,10,0}));

        Set<Integer> union = new HashSet<Integer>(numbers);
        union.addAll(number);
        System.out.print("Union of the two Set");
        System.out.println(union);

        Set<Integer> intersection = new HashSet<Integer>(numbers);
        intersection.addAll(number);
        System.out.print("Intersection of the two Set");
        System.out.println(union);

        Set<Integer> difference = new HashSet<Integer>(numbers);
        difference.addAll(number);
        System.out.println("Difference of two Set");
        System.out.println(difference);

        Set<String> myString = new HashSet<>();
        myString.addAll(Arrays.asList(
                new String[] {"Charmaine","Natasha","Farai","Tk","Charmaine"}

        ));
        System.out.println(myString);
        myString.remove("Natasha");
        System.out.println(myString);
       // System.out.println(myString.remove("Tk"));

        for (String value: myString)
        System.out.println(value);







    }
}