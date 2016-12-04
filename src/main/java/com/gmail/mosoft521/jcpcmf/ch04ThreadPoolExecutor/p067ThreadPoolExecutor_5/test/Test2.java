package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println("main begin ! " + System.currentTimeMillis());
        System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
        System.out.println("main   end ! " + System.currentTimeMillis());
        // 代码：awaitTermination(10, TimeUnit.SECONDS)作用：
        // 最多等待10秒，也就是阻塞10秒
    }
}
/*
main begin ! 1480770852624
pool-1-thread-1 1480770852625
pool-1-thread-1 1480770856626
true
main   end ! 1480770856626
Process finished with exit code 0
 */
