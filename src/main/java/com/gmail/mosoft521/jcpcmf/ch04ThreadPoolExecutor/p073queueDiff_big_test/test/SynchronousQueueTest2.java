package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueTest2 {

    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue linked = new SynchronousQueue<Runnable>();
        System.out.println(linked.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, linked);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + linked.size());
        // 直接执行3个任务
        // 有一个任务被拒绝
    }
}
/*
0
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable@7f31245a rejected from java.util.concurrent.ThreadPoolExecutor@6d6f6e28[Running, pool size = 3, active threads = 3, queued tasks = 0, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test.SynchronousQueueTest2.main(SynchronousQueueTest2.java:19)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
begin 1480772080675
begin 1480772080675
begin 1480772080676
  end 1480772081675
  end 1480772081676
  end 1480772081676

Process finished with exit code 1
 */