package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p133method1.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p133method1.myaction.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Run {
    public static void main(String[] args) {
        try {
            ForkJoinPool pool = new ForkJoinPool();
            pool.execute(new MyRecursiveAction());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
ThreadName=ForkJoinPool-1-worker-1
 */