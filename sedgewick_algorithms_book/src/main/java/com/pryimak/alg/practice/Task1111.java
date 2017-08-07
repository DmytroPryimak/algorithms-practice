package com.pryimak.alg.practice;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by dpryimak on 8/6/17.
 */
public class Task1111 {
    public static void main(String[] args) {
        boolean[][] input = {{true,true,true, true},{true,false,true, false},{true,true,false, false}};

        printArray(input);

    }

    public static void printArray(boolean[][] input) {
        int n = input.length;
        int m = input[0].length;

        StdOut.print("  ");

        for(int i = 0; i < m; i++) {
            StdOut.print(i + " ");
        }

        StdOut.println();
        for(int i = 0; i < n; i++) {
            StdOut.print(i + " ");
            for(int j = 0; j < m; j++) {
                StdOut.print((input[i][j] ? "*" : " ") + " ");
            }
            StdOut.println();
        }

    }
}
