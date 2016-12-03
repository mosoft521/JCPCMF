package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable2;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 myRunnable = new MyRunnable2();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();
        pool.execute(myRunnable);
        System.out.println("main end!");
    }
}
/*
任务成功完成！
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable2@677327b6 rejected from java.util.concurrent.ThreadPoolExecutor@14ae5a5[Shutting down, pool size = 2, active threads = 2, queued tasks = 0, completed tasks = 1]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.test.Test3.main(Test3.java:20)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
任务成功完成！
任务成功完成！

Process finished with exit code 1
 */