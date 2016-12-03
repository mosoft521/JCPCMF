package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable1;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 myRunnable = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L,
                TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        Thread.sleep(1000);
        pool.shutdownNow();
    }
}
/*
任务没有完成，就中断了！
进入catch中断了任务
任务没有完成，就中断了！
进入catch中断了任务
java.lang.InterruptedException
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable1.run(MyRunnable1.java:17)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)
java.lang.InterruptedException
	at com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p062ThreadPoolExecutor_2_shutdownNow.myrunnable.MyRunnable1.run(MyRunnable1.java:17)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

Process finished with exit code 0
 */