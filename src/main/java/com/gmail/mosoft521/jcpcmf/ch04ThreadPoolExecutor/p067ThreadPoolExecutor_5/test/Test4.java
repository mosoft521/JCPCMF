package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p067ThreadPoolExecutor_5.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println(pool.awaitTermination(Integer.MAX_VALUE,
                TimeUnit.SECONDS)
                + " " + System.currentTimeMillis() + " 全部任务执行完毕！");
    }
}
/*
pool-1-thread-1 1480770890501
pool-1-thread-2 1480770890501
pool-1-thread-2 1480770894503
pool-1-thread-1 1480770894503
pool-1-thread-2 1480770894503
pool-1-thread-1 1480770894503
pool-1-thread-1 1480770898503
pool-1-thread-2 1480770898503
true 1480770898503 全部任务执行完毕！

Process finished with exit code 0
 */