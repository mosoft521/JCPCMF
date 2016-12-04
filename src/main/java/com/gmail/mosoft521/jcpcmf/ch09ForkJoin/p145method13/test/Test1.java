package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        System.out.println("main begin ! " + System.currentTimeMillis());
        System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("main   end ! " + System.currentTimeMillis());
        // 此实验说明awaitTermination()方法具有阻塞特性
    }
}
/*
main begin ! 1480834107776
begin ForkJoinPool-1-worker-1 1480834107777
  end ForkJoinPool-1-worker-1 1480834111778
false
main   end ! 1480834117778
Process finished with exit code 0
 */