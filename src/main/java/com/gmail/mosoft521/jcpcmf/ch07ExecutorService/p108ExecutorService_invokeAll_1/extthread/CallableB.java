package com.gmail.mosoft521.jcpcmf.ch07ExecutorService.p108ExecutorService_invokeAll_1.extthread;

import java.util.concurrent.Callable;

public class CallableB implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " begin "
                + System.currentTimeMillis());
        Thread.sleep(8000);
        System.out.println(Thread.currentThread().getName() + "   end "
                + System.currentTimeMillis());
        return "returnB";
    }
}
