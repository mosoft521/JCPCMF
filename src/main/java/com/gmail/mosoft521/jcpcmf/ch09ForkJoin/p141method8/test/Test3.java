package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;

public class Test3 {
    public static void main(String[] args) {
        try {
            MyRunnable1 myRunnable = new MyRunnable1();
            ForkJoinPool pool = new ForkJoinPool();
            pool.submit(myRunnable);
            Thread.sleep(1000);
            pool.shutdown();
            pool.submit(myRunnable);
            System.out.println("main end!");
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
begin ForkJoinPool-1-worker-1 1480833715655
Exception in thread "main" java.util.concurrent.RejectedExecutionException
	at java.util.concurrent.ForkJoinPool.externalSubmit(ForkJoinPool.java:2328)
	at java.util.concurrent.ForkJoinPool.externalPush(ForkJoinPool.java:2419)
	at java.util.concurrent.ForkJoinPool.submit(ForkJoinPool.java:2703)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.test.Test3.main(Test3.java:15)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */