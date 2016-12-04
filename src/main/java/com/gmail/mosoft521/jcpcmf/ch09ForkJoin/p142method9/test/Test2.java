package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable2;

import java.util.concurrent.ForkJoinPool;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();
        System.out.println("main end!");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
/*
任务成功完成！
main end!

Process finished with exit code 1
 */