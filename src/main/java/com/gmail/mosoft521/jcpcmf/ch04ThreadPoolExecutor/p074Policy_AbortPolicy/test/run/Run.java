package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p074Policy_AbortPolicy.test.run;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println(Thread.currentThread().getName()
                            + " run end!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5,
                TimeUnit.SECONDS, new ArrayBlockingQueue(2),
                new ThreadPoolExecutor.AbortPolicy());
        executor.execute(runnable);// 不报错
        executor.execute(runnable);// 不报错
        executor.execute(runnable);// 不报错
        executor.execute(runnable);// 不报错
        executor.execute(runnable);// 不报错
        executor.execute(runnable);// 报错
    }
}
/*
Exception in thread "main" java.util.concurrent.RejectedExecutionException: Task com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p074Policy_AbortPolicy.test.run.Run$1@14ae5a5 rejected from java.util.concurrent.ThreadPoolExecutor@7f31245a[Running, pool size = 3, active threads = 3, queued tasks = 2, completed tasks = 0]
	at java.util.concurrent.ThreadPoolExecutor$AbortPolicy.rejectedExecution(ThreadPoolExecutor.java:2047)
	at java.util.concurrent.ThreadPoolExecutor.reject(ThreadPoolExecutor.java:823)
	at java.util.concurrent.ThreadPoolExecutor.execute(ThreadPoolExecutor.java:1369)
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p074Policy_AbortPolicy.test.run.Run.main(Run.java:31)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
pool-1-thread-1 run end!
pool-1-thread-3 run end!
pool-1-thread-2 run end!
pool-1-thread-1 run end!
pool-1-thread-3 run end!
Process finished with exit code 1
 */