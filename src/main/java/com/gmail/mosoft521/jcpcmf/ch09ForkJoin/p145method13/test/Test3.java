package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable.MyRunnable2;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println("A=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
        System.out.println("B=" + pool.awaitTermination(1, TimeUnit.SECONDS)
                + " " + System.currentTimeMillis());
    }
}
/*
A=false 1480834164313
B=false 1480834165315

Process finished with exit code 0
 */