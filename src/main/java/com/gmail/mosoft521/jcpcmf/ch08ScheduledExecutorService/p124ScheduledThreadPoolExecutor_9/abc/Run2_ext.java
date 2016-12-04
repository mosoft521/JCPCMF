package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.abc;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.mycallable.MyRunnable;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2_ext {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10);
        Runnable runnable1 = new MyRunnable("A");
        ScheduledFuture future = executor.schedule(runnable1, 1,
                TimeUnit.SECONDS);
        System.out.println(future.cancel(true));
        System.out.println("size=" + executor.getQueue().size());
        System.out.println("main end");
    }
}
