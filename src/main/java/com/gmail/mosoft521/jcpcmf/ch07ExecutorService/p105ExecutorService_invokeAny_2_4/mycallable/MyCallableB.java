package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p105ExecutorService_invokeAny_2_4.mycallable;

import java.util.concurrent.Callable;

public class MyCallableB implements Callable<String> {
    public String call() throws Exception {
        System.out.println("MyCallableB begin " + System.currentTimeMillis());
        for (int i = 0; i < 123456; i++) {
            Math.random();
            Math.random();
            Math.random();
            System.out.println("MyCallableB " + (i + 1));
        }
        System.out.println("MyCallableB   end " + System.currentTimeMillis());
        if (1 == 1) {
            System.out.println("1==1");
            throw new Exception("报错了BBBBB");
        }
        return "returnB";
    }
}