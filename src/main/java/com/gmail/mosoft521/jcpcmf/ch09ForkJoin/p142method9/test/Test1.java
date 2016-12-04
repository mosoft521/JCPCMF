package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable1;

import java.util.concurrent.ForkJoinPool;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ForkJoinPool pool = new ForkJoinPool();
        pool.submit(myRunnable);
        Thread.sleep(2000);
        pool.shutdownNow();
        pool.submit(myRunnable);
    }
}
/*
任务没有完成，就中断了！
进入catch中断了任务
Exception in thread "main" java.lang.InterruptedException
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.myrunnable.MyRunnable1.run(MyRunnable1.java:17)
	at java.util.concurrent.ForkJoinTask$AdaptedRunnableAction.exec(ForkJoinTask.java:1386)
	at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
	at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
	at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
	at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
java.util.concurrent.RejectedExecutionException
	at java.util.concurrent.ForkJoinPool.externalSubmit(ForkJoinPool.java:2328)
	at java.util.concurrent.ForkJoinPool.externalPush(ForkJoinPool.java:2419)
	at java.util.concurrent.ForkJoinPool.submit(ForkJoinPool.java:2703)
	at com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p142method9.test.Test1.main(Test1.java:14)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

Process finished with exit code 1
 */