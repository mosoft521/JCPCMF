package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.test;

import java.util.concurrent.ForkJoinPool;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println("main end!");
    }
}
/*
main end!
Process finished with exit code 0
 */