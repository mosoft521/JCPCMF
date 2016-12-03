package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.mythreadfactory;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactoryB implements ThreadFactory {
    public Thread newThread(Runnable r) {
        Thread newThread = new Thread(r);
        newThread.setName("我的新名称：" + new Date());
        newThread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("自定义处理异常启用：" + t.getName() + " "
                        + e.getMessage());
                e.printStackTrace();
            }
        });
        return newThread;
    }
}