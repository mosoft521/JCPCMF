package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p115ScheduledThreadPoolExecutor_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p115ScheduledThreadPoolExecutor_2.mycallable.MyRunnableA;
import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p115ScheduledThreadPoolExecutor_2.mycallable.MyRunnableB;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        List<Runnable> runnableList = new ArrayList();
        runnableList.add(new MyRunnableA());
        runnableList.add(new MyRunnableB());
        ScheduledExecutorService executor = Executors
                .newSingleThreadScheduledExecutor();

        System.out.println("     X=" + System.currentTimeMillis());
        executor.schedule(runnableList.get(0), 0L, TimeUnit.SECONDS);
        executor.schedule(runnableList.get(1), 0L, TimeUnit.SECONDS);
        System.out.println("     Y=" + System.currentTimeMillis());

    }
}
/*
     X=1480823120434
     Y=1480823120435
runnableA begin pool-1-thread-1 1480823120436
runnableA   end pool-1-thread-1 1480823123436
runnableB begin pool-1-thread-1 1480823123436
runnableB   end pool-1-thread-1 1480823123436

Process finished with exit code 1
 */