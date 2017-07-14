package com.company;

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
    }
}
