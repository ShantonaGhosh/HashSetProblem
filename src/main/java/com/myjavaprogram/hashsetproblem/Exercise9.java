package com.myjavaprogram.hashsetproblem;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise9 {

    public static void main(String[] args) {
      TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1);
        numbers.add(6);

        System.out.println("Original TreeSet: " + numbers);

       
        SortedSet<Integer> lessThanSeven = numbers.headSet(7);

        System.out.println("Numbers less than 7: " + lessThanSeven);
    }
    }


