package com.company;

/**
 * Created by nandulaj on 7/14/17.
 */
public interface Formula {

    double calaculte(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
