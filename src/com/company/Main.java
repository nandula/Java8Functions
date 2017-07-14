package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Formula formula = new Formula() {
            @Override
            public double calaculte(int a) {
                return sqrt(a);
            }
        };

        System.out.println(formula.sqrt(16));
        System.out.println(formula.calaculte(225));

        List<String> names = Arrays.asList("peter", "anne", "mike", "xenia");
        //without lambda
       /* Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });*/

        //with lambda
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));

        for (String name : names) {
            System.out.println(name);
        }


    }
}
