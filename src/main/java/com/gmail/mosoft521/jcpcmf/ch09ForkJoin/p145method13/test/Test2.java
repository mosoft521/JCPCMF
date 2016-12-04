package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println("main begin ! " + System.currentTimeMillis());
        System.out.println(pool.awaitTermination(3, TimeUnit.SECONDS));
        System.out.println("main   end ! " + System.currentTimeMillis());
        // 代码：awaitTermination(10, TimeUnit.SECONDS)作用：
        // 最多等待10秒，也就是阻塞10秒
    }
}
/*
main begin ! 1480834141686
begin ForkJoinPool-1-worker-1 1480834141686
false
main   end ! 1480834144688
Process finished with exit code 0
 */