package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p060ThreadPoolExecutor_1.test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4_1 {
    // 队列使用LinkedBlockingDeque类
    // 并且线程数量>corePoolSize时将其余的任务放入队列中
    // 同一时间最多只能有7个线程在运行
    // 所以keepAliveTime>5时也不清除空闲线程
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName()
                            + " run!" + System.currentTimeMillis());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        executor.execute(runnable);// 1
        executor.execute(runnable);// 2
        executor.execute(runnable);// 3
        executor.execute(runnable);// 4
        executor.execute(runnable);// 5
        executor.execute(runnable);// 6
        executor.execute(runnable);// 7
        executor.execute(runnable);// 8
        executor.execute(runnable);// 9
        Thread.sleep(300);
        System.out.println("A:" + executor.getCorePoolSize());
        System.out.println("A:" + executor.getPoolSize());
        System.out.println("A:" + executor.getQueue().size());
        Thread.sleep(10000);
        System.out.println("B:" + executor.getCorePoolSize());
        System.out.println("B:" + executor.getPoolSize());
        System.out.println("B:" + executor.getQueue().size());
    }
    // 通过此实验可以得知，如果使用LinkedBlockingDeque做为任务队列
    // 则不管线程数>corePoolSize还是>maximumPoolSize
    // 程序都可以得到正确无误的运行，并且不会出现异常
    // 按钮呈红色，因为池中还有线程在等待任务
}
/*
pool-1-thread-1 run!1480769977787
pool-1-thread-3 run!1480769977787
pool-1-thread-4 run!1480769977787
pool-1-thread-5 run!1480769977787
pool-1-thread-2 run!1480769977788
pool-1-thread-6 run!1480769977788
pool-1-thread-7 run!1480769977790
A:7
A:7
A:2
pool-1-thread-4 run!1480769978787
pool-1-thread-1 run!1480769978787
B:7
B:7
B:0
Process finished with exit code 1
 */