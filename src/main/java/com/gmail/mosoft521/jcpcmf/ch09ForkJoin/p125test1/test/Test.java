package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p125test1.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p125test1.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new MyRecursiveAction());
        Thread.sleep(5000);
    }
}
/*
compute run!

Process finished with exit code 0
 */