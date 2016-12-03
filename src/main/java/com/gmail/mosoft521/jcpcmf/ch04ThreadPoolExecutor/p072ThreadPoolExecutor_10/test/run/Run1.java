package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p072ThreadPoolExecutor_10.test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    System.out.println("打印了！"
                            + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
        Thread.sleep(1000);
        System.out.println(executor.getCompletedTaskCount());
    }
}
/*
0
打印了！pool-1-thread-1
打印了！pool-1-thread-2
2
打印了！pool-1-thread-2
打印了！pool-1-thread-1
4
打印了！pool-1-thread-1
打印了！pool-1-thread-2
6
6

Process finished with exit code 1
 */