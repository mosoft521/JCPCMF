package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.myrunnable.MyRunnable1;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable1 = new MyRunnable1("中国1");
        MyRunnable1 myRunnable2 = new MyRunnable1("中国2");
        MyRunnable1 myRunnable3 = new MyRunnable1("中国3");
        MyRunnable1 myRunnable4 = new MyRunnable1("中国4");
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 9999L,
                TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        pool.execute(myRunnable1);
        pool.execute(myRunnable2);
        pool.execute(myRunnable3);
        pool.execute(myRunnable4);
    }
}
/*
pool-1-thread-1 1480771240080
pool-1-thread-2 1480771240080
pool-1-thread-3 1480771240080
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.myrunnable.MyRunnable1@7f31245a rejected from java.util.concurrent.ThreadPoolExecutor@6d6f6e28[Running, pool size = 3, active threads = 3, queued tasks = 0, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p069ThreadPoolExecutor_7.test.Test1.main(Test1.java:20)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
pool-1-thread-1 1480771244081
pool-1-thread-3 1480771244081
pool-1-thread-2 1480771244081
Process finished with exit code 1
 */