package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p118ScheduledThreadPoolExecutor_4_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p118ScheduledThreadPoolExecutor_4_1.mycallable.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors
                .newSingleThreadScheduledExecutor();
        System.out.println("           X=" + System.currentTimeMillis());
        executor.scheduleAtFixedRate(new MyRunnable(), 1, 2, TimeUnit.SECONDS);
        System.out.println("           Y=" + System.currentTimeMillis());
    }
}
/*
           X=1480823290476
           Y=1480823290483
      begin =1480823291491 ThreadName=pool-1-thread-1
        end =1480823291491 ThreadName=pool-1-thread-1
      begin =1480823293483 ThreadName=pool-1-thread-1
        end =1480823293483 ThreadName=pool-1-thread-1
      begin =1480823295483 ThreadName=pool-1-thread-1
        end =1480823295483 ThreadName=pool-1-thread-1
     ...

Process finished with exit code 1
 */