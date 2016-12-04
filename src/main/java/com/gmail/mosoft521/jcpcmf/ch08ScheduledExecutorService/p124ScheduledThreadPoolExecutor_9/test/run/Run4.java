package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.mycallable.MyRunnable;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10);
        Runnable runnable1 = new MyRunnable("A");
        ScheduledFuture future = executor.schedule(runnable1, 0,
                TimeUnit.SECONDS);
        Thread.sleep(3000);
        System.out.println(future.cancel(false));
        System.out.println("main end!");
    }
}
/*
main run
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
true
main end!
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
run! username=A pool-1-thread-1
...
Process finished with exit code 1
 */