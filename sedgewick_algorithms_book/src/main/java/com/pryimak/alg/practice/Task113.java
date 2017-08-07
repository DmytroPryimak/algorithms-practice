package com.pryimak.alg.practice;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by dpryimak on 8/6/17.
 */
public class Task113 {
    public static void main(String[] args) {
        int [] input = StdIn.readAllInts();
        StdOut.print(input[0] == input[1] && input[1] == input[2] ? "equal" : "not equal");
    }
}
