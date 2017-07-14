package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nandulaj on 7/14/17.
 */
public class Streams {
    List<String> stringCollection = new ArrayList<>();

    public void addObjects() {
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
    }

}
