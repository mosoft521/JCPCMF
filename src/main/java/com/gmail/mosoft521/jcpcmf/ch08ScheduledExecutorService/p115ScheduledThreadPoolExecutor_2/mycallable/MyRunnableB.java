package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p115ScheduledThreadPoolExecutor_2.mycallable;

public class MyRunnableB implements Runnable {
    @Override
    public void run() {
        System.out.println("runnableB begin " + Thread.currentThread().getName()
                + " " + System.currentTimeMillis());
        System.out.println("runnableB   end " + Thread.currentThread().getName()
                + " " + System.currentTimeMillis());
    }
}
