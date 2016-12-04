package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName() + " 执行compute方法()");
        String nullString = null;
        nullString.toString();
        return 100;
    }
}