package com.techolution;

import java.util.Scanner;

public class InTheFuture {

    static int minNum(int A, int K, int P) {
        if(A >= K) {
            return -1;
        } else {
            return minNum(A, K, P, 1);
        }
    }

    static int minNum(int A, int K, int P, int idx) {
        if(A + P >= K) {
            return 1 + minNum(A + (A / idx), K + (K / idx), P, ++idx);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int K = in.nextInt();
        int P = in.nextInt();

        System.out.println(minNum(A, K, P));
    }
}
