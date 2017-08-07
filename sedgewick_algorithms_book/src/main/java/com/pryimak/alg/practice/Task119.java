package com.pryimak.alg.practice;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by dpryimak on 8/6/17.
 */
public class Task119 {
    public static void main(String[] args) {
        int a = 3;
        String a_str = "11";
        int b = 5;
        String b_str = "101";

        StdOut.print(toBinary(15));
    }

    public static String toBinary(int a) {
        String result = "";
        for (;a > 0; a /= 2)
            result = (a % 2) + result;

        return result;
    }
}
