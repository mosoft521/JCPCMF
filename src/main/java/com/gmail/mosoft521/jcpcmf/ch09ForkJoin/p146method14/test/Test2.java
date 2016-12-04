package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask action = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        String returnString = pool.invoke(action);
        System.out.println(returnString);
    }
}
/*
我是返回值

Process finished with exit code 0
 */