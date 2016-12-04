package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p090future_callable_5.mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(10000);
        System.out.println("sleep 10秒执行完了！");
        return "anyString";
    }
}