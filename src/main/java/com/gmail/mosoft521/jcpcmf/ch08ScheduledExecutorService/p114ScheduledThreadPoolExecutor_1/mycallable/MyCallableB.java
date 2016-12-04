package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p114ScheduledThreadPoolExecutor_1.mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("callB begin " + Thread.currentThread().getName()
                + " " + System.currentTimeMillis());
        System.out.println("callB   end " + Thread.currentThread().getName()
                + " " + System.currentTimeMillis());
        return "returnB";
    }
}
