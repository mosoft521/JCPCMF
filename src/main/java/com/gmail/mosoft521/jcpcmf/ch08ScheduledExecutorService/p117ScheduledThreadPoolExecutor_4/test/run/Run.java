package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p117ScheduledThreadPoolExecutor_4.test.run;

import com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p117ScheduledThreadPoolExecutor_4.mycallable.MyRunnable;

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
           X=1480823234893
           Y=1480823234896
      begin =1480823235896 ThreadName=pool-1-thread-1
        end =1480823239898 ThreadName=pool-1-thread-1
      begin =1480823239898 ThreadName=pool-1-thread-1
        end =1480823243898 ThreadName=pool-1-thread-1
      begin =1480823243898 ThreadName=pool-1-thread-1
Process finished with exit code 1
 */