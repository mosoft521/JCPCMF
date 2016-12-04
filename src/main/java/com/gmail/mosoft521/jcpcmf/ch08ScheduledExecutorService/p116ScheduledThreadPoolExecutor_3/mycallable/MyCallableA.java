package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p116ScheduledThreadPoolExecutor_3.mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {
    public String call() throws Exception {
        System.out.println("a call run =" + System.currentTimeMillis());
        return "returnA";
    }
}