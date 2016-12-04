package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable2;

import java.util.concurrent.ForkJoinPool;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();// 返回一个空的List
        pool.execute(myRunnable);
        System.out.println("main end!");
        Thread.sleep(Integer.MAX_VALUE);
        // shutdown:
        // 每个任务正常运行直到结束，
        // 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常。
        // shutdownNow结合isInterrupted() ==true判断:
        // 立即停止当前正在执行的任务
        // 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常
        // shutdownNow未结合isInterrupted() ==true判断:
        // 每个任务正常运行直到结束
        // 池关闭后不再允许有新任务被执行并抛出RejectedExecutionException异常
    }
}
/*
任务成功完成！
Exception in thread "main" java.util.concurrent.RejectedExecutionException
	at java.util.concurrent.ForkJoinPool.externalSubmit(ForkJoinPool.java:2328)
	at java.util.concurrent.ForkJoinPool.externalPush(ForkJoinPool.java:2419)
	at java.util.concurrent.ForkJoinPool.execute(ForkJoinPool.java:2648)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test.Test3.main(Test3.java:14)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */