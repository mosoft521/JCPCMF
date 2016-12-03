package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdown();
        pool.execute(myRunnable);
        System.out.println("main end!");
    }
}
/*
begin pool-1-thread-1 1480770312935
begin pool-1-thread-2 1480770312935
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.myrunnable.MyRunnable1@677327b6 rejected from java.util.concurrent.ThreadPoolExecutor@14ae5a5[Shutting down, pool size = 2, active threads = 2, queued tasks = 2, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p061ThreadPoolExecutor_2.test.Test4.main(Test4.java:20)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
  end pool-1-thread-1 1480770316936
begin pool-1-thread-1 1480770316936
  end pool-1-thread-2 1480770316937
begin pool-1-thread-2 1480770316937
  end pool-1-thread-1 1480770320936
  end pool-1-thread-2 1480770320937

Process finished with exit code 1
 */