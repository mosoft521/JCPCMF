package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.mytask.MyRecursiveTask;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Test2 {
    public static void main(String[] args) {
        MyRecursiveTask task1 = new MyRecursiveTask();
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask task2 = pool.submit(task1);
        System.out.println(task2.join());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
            Math.random();
        }
        System.out.println("main end");
    }
}
/*
ForkJoinPool-1-worker-1 执行compute方法()
Exception in thread "main" java.lang.NullPointerException
	at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
	at java.util.concurrent.ForkJoinTask.getThrowableException(ForkJoinTask.java:598)
	at java.util.concurrent.ForkJoinTask.reportException(ForkJoinTask.java:677)
	at java.util.concurrent.ForkJoinTask.join(ForkJoinTask.java:720)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.test.Test2.main(Test2.java:14)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Caused by: java.lang.NullPointerException
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.mytask.MyRecursiveTask.compute(MyRecursiveTask.java:10)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p128join_get.mytask.MyRecursiveTask.compute(MyRecursiveTask.java:5)
	at java.util.concurrent.RecursiveTask.exec(RecursiveTask.java:94)
	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
Process finished with exit code 1
 */