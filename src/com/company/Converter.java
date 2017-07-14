package com.company;

/**
 * Created by nandulaj on 7/14/17.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
