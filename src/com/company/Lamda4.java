package com.company;

/**
 * Created by nandulaj on 7/14/17.
 */
public class Lamda4 {

    static int outerStaticNum;
    int outerNum;

    void testScopes() {

        Converter<Integer, String> stringConverter1 = from -> {
            outerNum = 23;
            return String.valueOf(outerNum);
        };

        Converter<Integer, String> stringConverter2 = from -> {
            outerStaticNum = 72;
            return String.valueOf(outerStaticNum);
        };
    }
}
