package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println(System.currentTimeMillis());
        System.out.println(pool.awaitTermination(Integer.MAX_VALUE,
                TimeUnit.SECONDS)
                + " " + System.currentTimeMillis() + " 全部任务执行完毕！");
        System.out.println(System.currentTimeMillis());
    }
}
/*
1480834176516
begin ForkJoinPool-1-worker-1 1480834176516
  end ForkJoinPool-1-worker-1 1480834180517
true 1480834180517 全部任务执行完毕！
1480834180517
Process finished with exit code 0
 */