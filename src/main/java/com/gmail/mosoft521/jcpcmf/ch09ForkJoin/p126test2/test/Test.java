package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p126test2.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p126test2.action.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(new MyRecursiveAction(1, 10));
        Thread.sleep(5000);
    }
}
/*
ForkJoinPool-1-worker-1 -------
ForkJoinPool-1-worker-1 -------
ForkJoinPool-1-worker-1 -------
打印组合为：1-3
ForkJoinPool-1-worker-1 -------
打印组合为：4-5
ForkJoinPool-1-worker-1 -------
ForkJoinPool-1-worker-1 -------
打印组合为：6-8
ForkJoinPool-1-worker-1 -------
打印组合为：9-10
 */