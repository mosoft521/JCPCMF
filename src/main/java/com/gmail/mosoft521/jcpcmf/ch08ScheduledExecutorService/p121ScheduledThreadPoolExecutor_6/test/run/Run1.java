package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p121ScheduledThreadPoolExecutor_6.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p121ScheduledThreadPoolExecutor_6.mycallable.MyRunnable;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10);
        Runnable runnable1 = new MyRunnable("A");
        Runnable runnable2 = new MyRunnable("B");
        Runnable runnable3 = new MyRunnable("C");
        Runnable runnable4 = new MyRunnable("D");
        Runnable runnable5 = new MyRunnable("E");
        System.out.println(runnable1.hashCode());
        System.out.println(runnable2.hashCode());
        System.out.println(runnable3.hashCode());
        System.out.println(runnable4.hashCode());
        System.out.println(runnable5.hashCode());
        executor.scheduleAtFixedRate(runnable1, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable2, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable3, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable4, 10, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(runnable5, 10, 2, TimeUnit.SECONDS);
        System.out.println("");
        BlockingQueue<Runnable> queue = executor.getQueue();
        Iterator<Runnable> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Runnable runnable = (Runnable) iterator.next();
            System.out.println("队列中的：" + runnable);
        }
    }
}
/*
1956725890
356573597
1735600054
21685669
2133927002
队列中的：java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@7ea987ac
队列中的：java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@12a3a380
队列中的：java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@29453f44
队列中的：java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@5cad8086
队列中的：java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask@6e0be858
run! username=A pool-1-thread-1
run! username=B pool-1-thread-1
run! username=C pool-1-thread-6
run! username=D pool-1-thread-8
run! username=E pool-1-thread-5
run! username=A pool-1-thread-3
run! username=B pool-1-thread-2
run! username=C pool-1-thread-4
run! username=D pool-1-thread-2
run! username=E pool-1-thread-1
run! username=A pool-1-thread-4
run! username=B pool-1-thread-8
run! username=D pool-1-thread-5
run! username=C pool-1-thread-9
run! username=E pool-1-thread-10
run! username=A pool-1-thread-8
...
Process finished with exit code 1
 */