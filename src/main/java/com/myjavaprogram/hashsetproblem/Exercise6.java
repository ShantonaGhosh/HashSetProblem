
package com.myjavaprogram.hashsetproblem;

import java.util.HashSet;

public class Exercise6 {
        public static void main(String[] args){
          HashSet<String> hashSet = new  HashSet<String>(); 
          hashSet.add("red");
            hashSet.add("white");
              hashSet.add("black");
                HashSet<String> hashSet1 =   (HashSet<String>)hashSet.clone(); 
                System.out.println(hashSet1);
             
              
          
             
         
        
    }
    
}
