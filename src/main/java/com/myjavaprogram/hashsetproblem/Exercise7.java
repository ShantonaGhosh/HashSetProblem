package com.myjavaprogram.hashsetproblem;



import java.util.HashSet;

public class Exercise7 {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("red");
        hashSet.add("white");
        hashSet.add("black");
        
      
        String[] newarray = new String[hashSet.size()];
        hashSet.toArray(newarray);
        for(String element : newarray){
        System.out.println(element);
     }

    }

}
