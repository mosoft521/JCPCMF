package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p060ThreadPoolExecutor_1.test.run;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run3_2 {
    // 队列使用SynchronousQueue类
    // 并且线程数量>corePoolSize时
    // 将其余的任务也放入池中，总数量为8，
    // 并没有超过maximumPoolSize值
    // 由于运行的线程数为8，数量上>corePoolSize为7的值
    // 所以keepAliveTime>5时清除空闲线程
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
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        executor.execute(runnable);// 1
        executor.execute(runnable);// 2
        executor.execute(runnable);// 3
        executor.execute(runnable);// 4
        executor.execute(runnable);// 5
        executor.execute(runnable);// 6
        executor.execute(runnable);// 7
        executor.execute(runnable);// 8
        Thread.sleep(300);
        System.out.println("A:" + executor.getCorePoolSize());
        System.out.println("A:" + executor.getPoolSize());
        System.out.println("A:" + executor.getQueue().size());
        Thread.sleep(10000);
        System.out.println("B:" + executor.getCorePoolSize());
        System.out.println("B:" + executor.getPoolSize());
        System.out.println("B:" + executor.getQueue().size());
    }
    // 按钮呈红色，因为池中还有线程在等待任务
    // 删除的是>corePoolSize的多余线程
}
/*
pool-1-thread-1 run!1480769936757
pool-1-thread-5 run!1480769936759
pool-1-thread-4 run!1480769936759
pool-1-thread-8 run!1480769936759
pool-1-thread-3 run!1480769936759
pool-1-thread-7 run!1480769936760
pool-1-thread-2 run!1480769936761
pool-1-thread-6 run!1480769936761
A:7
A:8
A:0
B:7
B:7
B:0
Process finished with exit code 1
 */