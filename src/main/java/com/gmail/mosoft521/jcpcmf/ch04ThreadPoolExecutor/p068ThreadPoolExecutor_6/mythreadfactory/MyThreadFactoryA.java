package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.mythreadfactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactoryA implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread newThread = new Thread(r);
        newThread.setName("Alvin：" + new Date());
        return newThread;
    }
}