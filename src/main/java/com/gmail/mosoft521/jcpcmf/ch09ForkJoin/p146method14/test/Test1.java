package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p146method14.myaction.MyRecursiveAction;

import java.util.concurrent.ForkJoinPool;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRecursiveAction action = new MyRecursiveAction();
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(action);
    }
}
/*
ThreadName=ForkJoinPool-1-worker-1

Process finished with exit code 0
 */