package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p122ScheduledThreadPoolExecutor_7.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p122ScheduledThreadPoolExecutor_7.mycallable.MyRunnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                1);
        Runnable runnable1 = new MyRunnable("A");
        Runnable runnable2 = new MyRunnable("B");
        executor.schedule(runnable1, 3, TimeUnit.SECONDS);
        executor.shutdown();
        System.out.println("已经shutdown了");
    }
}
/*
已经shutdown了
run! username=A pool-1-thread-1 1480823685195
Process finished with exit code 0
 */