
package com.myjavaprogram.hashsetproblem;

import java.util.HashSet;


public class Exercise11 {
    public static void main(){
          HashSet<String> h_set = new HashSet<String>();

        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");

        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        h_set.retainAll(h_set2);
           System.out.println(h_set);
    }
    
}
