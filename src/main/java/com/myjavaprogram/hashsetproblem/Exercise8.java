package com.myjavaprogram.hashsetproblem;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise8 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("red");
        hashSet.add("white");
        hashSet.add("black");

        Set<String> treeSet = new TreeSet<String>(hashSet);

        for (String element : treeSet) {
            System.out.println(element);
        }

    }

}
