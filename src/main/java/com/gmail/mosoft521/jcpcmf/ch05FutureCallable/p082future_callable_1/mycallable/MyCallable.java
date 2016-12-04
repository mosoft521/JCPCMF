package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p082future_callable_1.mycallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int age;

    public MyCallable(int age) {
        super();
        this.age = age;
    }

    public String call() throws Exception {
        Thread.sleep(8000);
        return "返回值 年龄是：" + age;
    }
}