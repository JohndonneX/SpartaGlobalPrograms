package com.sparta.dt;

public class Fibonacci {
    public static String fibonacci(int param) {
        int a = 0, b = 1;
        int c;
        String sequence = "First " + param + " number(s) of Fibonacci sequence: ";
        if (param == 1) {
            return (sequence += a);
        } else if (param == 2) {
            return (sequence += a + ", " + b);
        } else {
            sequence += a + ", " + b;
        }
        for (int i = 0; i < (param - 2); i++) {
            c = a + b;
            sequence += ", " + c;
            a = b;
            b = c;
        }
        return sequence;
    }
}
