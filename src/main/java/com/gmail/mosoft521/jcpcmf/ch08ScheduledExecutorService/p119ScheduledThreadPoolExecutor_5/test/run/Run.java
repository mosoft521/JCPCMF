package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p119ScheduledThreadPoolExecutor_5.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p119ScheduledThreadPoolExecutor_5.mycallable.MyRunnable;

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
           X=1480823377802
           Y=1480823377807
      begin =1480823378819 ThreadName=pool-1-thread-1
        end =1480823382819 ThreadName=pool-1-thread-1
      begin =1480823384820 ThreadName=pool-1-thread-1
        end =1480823388820 ThreadName=pool-1-thread-1
      begin =1480823390821 ThreadName=pool-1-thread-1
        end =1480823394821 ThreadName=pool-1-thread-1
      begin =1480823396822 ThreadName=pool-1-thread-1
        end =1480823400822 ThreadName=pool-1-thread-1
...
Process finished with exit code 1
 */