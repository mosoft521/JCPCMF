package com.gmail.mosoft521.jcpcmf.ch06CompletionService.p099ExecutorCompletionService_errorHandle.mycallable;

import java.util.concurrent.Callable;

public class MyCallableA implements Callable<String> {

    public String call() throws Exception {
        System.out.println("MyCallableA begin " + System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println("MyCallableA   end " + System.currentTimeMillis());
        return "returnA";
    }
}