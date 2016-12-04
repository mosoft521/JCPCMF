package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p091future_callable_6.extcallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private String number;

    public MyCallable(String number) {
        super();
        this.number = number;
    }

    @Override
    public String call() throws Exception {
        Integer.parseInt("a");
        return "我是Alvin" + number;
    }
}
