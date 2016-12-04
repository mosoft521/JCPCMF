package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p120ScheduledThreadPoolExecutor_5_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p120ScheduledThreadPoolExecutor_5_1.mycallable.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors
                .newSingleThreadScheduledExecutor();
        System.out.println("           X=" + System.currentTimeMillis());
        executor.scheduleWithFixedDelay(new MyRunnable(), 1, 2,
                TimeUnit.SECONDS);
        System.out.println("           Y=" + System.currentTimeMillis());
    }
}
/*
           X=1480823448135
           Y=1480823448137
      begin =1480823449137 ThreadName=pool-1-thread-1
        end =1480823449137 ThreadName=pool-1-thread-1
      begin =1480823451138 ThreadName=pool-1-thread-1
        end =1480823451138 ThreadName=pool-1-thread-1
      begin =1480823453139 ThreadName=pool-1-thread-1
        end =1480823453139 ThreadName=pool-1-thread-1
      begin =1480823455140 ThreadName=pool-1-thread-1
        end =1480823455140 ThreadName=pool-1-thread-1
      begin =1480823457141 ThreadName=pool-1-thread-1
        end =1480823457141 ThreadName=pool-1-thread-1
...
Process finished with exit code 1
 */