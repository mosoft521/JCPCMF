package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p098ExecutorCompletionService_3.mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println("MyCallableA " + System.currentTimeMillis());
        return "returnA";
    }
}
