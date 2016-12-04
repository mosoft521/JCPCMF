package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p148method17.test.run;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p148method17.mytask.MyRecursiveTask1;

import java.util.concurrent.ForkJoinPool;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyRecursiveTask1 task11 = new MyRecursiveTask1();

        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.isQuiescent());
        pool.submit(task11);
        Thread.sleep(1000);
        System.out.println(pool.isQuiescent());
    }
}
/*
true
beginA=ForkJoinPool-1-worker-1
false

Process finished with exit code 0
 */