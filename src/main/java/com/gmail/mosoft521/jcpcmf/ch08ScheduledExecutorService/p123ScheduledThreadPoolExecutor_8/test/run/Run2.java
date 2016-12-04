package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p123ScheduledThreadPoolExecutor_8.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p123ScheduledThreadPoolExecutor_8.mycallable.MyRunnable;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10);
        Runnable runnable1 = new MyRunnable("A");
        executor.scheduleAtFixedRate(runnable1, 1, 2, TimeUnit.SECONDS);
        executor.setContinueExistingPeriodicTasksAfterShutdownPolicy(true);
        executor.shutdown();
        System.out.println("执行了shutdown!");
    }
}
/*
执行了shutdown!
run! username=A pool-1-thread-1 1480823783231
run! username=A pool-1-thread-1 1480823785231
run! username=A pool-1-thread-2 1480823787231
...
Process finished with exit code 1
 */