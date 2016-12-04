package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        Thread.sleep(1000);
        pool.shutdown();
        System.out.println("main end!");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
/*
begin ForkJoinPool-1-worker-1 1480833688577
main end!
  end ForkJoinPool-1-worker-1 1480833690578
Process finished with exit code 1
 */