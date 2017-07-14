package com.company;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by nandulaj on 7/14/17.
 */
public class BuiltIn {

    void runFunctions() {

        Predicate<String> predicate = s -> s.length() > 0;
        System.out.println(predicate.test("Foo"));
        System.out.println(predicate.negate().test("Foo"));

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

    }

}
