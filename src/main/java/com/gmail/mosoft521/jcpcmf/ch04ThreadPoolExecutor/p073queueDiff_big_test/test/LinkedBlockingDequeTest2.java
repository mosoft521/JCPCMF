package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeTest2 {

    public static void main(String[] args) throws InterruptedException {
        // LinkedBlockingDeque使用带参构造
        // max值被参考
        // 但队列容量不够，有一个任务出现异常
        LinkedBlockingDeque linked = new LinkedBlockingDeque<Runnable>(2);
        System.out.println(linked.size());
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, linked);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        System.out.println(pool.getPoolSize() + " " + linked.size());
        // 先放入队列2个任务，再执行3个任务
        // 有1个任务被拒绝
    }
}
/*
0
begin 1480772014137
begin 1480772014138
Exception in thread "main" begin 1480772014138
java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable.MyRunnable@14ae5a5 rejected from java.util.concurrent.ThreadPoolExecutor@7f31245a[Running, pool size = 3, active threads = 3, queued tasks = 2, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.test.LinkedBlockingDequeTest2.main(LinkedBlockingDequeTest2.java:24)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
  end 1480772015138
  end 1480772015138
  end 1480772015138
begin 1480772015138
begin 1480772015138
  end 1480772016138
  end 1480772016138

Process finished with exit code 1
 */