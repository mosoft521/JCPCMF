package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p127test3.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p127test3.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test2 {
    public static void main(String[] args) {
        try {
            MyRecursiveTask task1 = new MyRecursiveTask();
            System.out.println(task1.hashCode());
            ForkJoinPool pool = new ForkJoinPool();
            ForkJoinTask task2 = pool.submit(task1);
            System.out.println(task2.hashCode() + " " + task2.join());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
356573597
compute time=1480832408895
356573597 100
 */