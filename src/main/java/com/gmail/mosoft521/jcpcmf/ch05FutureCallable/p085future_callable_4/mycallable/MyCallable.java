package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p085future_callable_4.mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "我的年龄是100";
    }
}
