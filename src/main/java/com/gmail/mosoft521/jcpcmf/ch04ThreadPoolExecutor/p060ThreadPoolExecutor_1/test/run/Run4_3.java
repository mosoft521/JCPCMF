package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p060ThreadPoolExecutor_1.test.run;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4_3 {
    // 队列使用SynchronousQueue类
    // 线程数量>corePoolSize
    // 并且线程数量>maximumPoolSize
    // 所以出现异常
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
    // 按钮会变灰
}
/*
pool-1-thread-1 run!1480770070795
pool-1-thread-2 run!1480770070796
pool-1-thread-5 run!1480770070797
pool-1-thread-3 run!1480770070797
pool-1-thread-4 run!1480770070797
pool-1-thread-7 run!1480770070797
pool-1-thread-8 run!1480770070797
pool-1-thread-6 run!1480770070797
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p060ThreadPoolExecutor_1.test.run.Run4_3$1@2503dbd3 rejected from java.util.concurrent.ThreadPoolExecutor@4b67cf4d[Running, pool size = 8, active threads = 8, queued tasks = 0, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p060ThreadPoolExecutor_1.test.run.Run4_3.main(Run4_3.java:35)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */