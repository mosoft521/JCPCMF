package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p118ScheduledThreadPoolExecutor_4_1.mycallable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("      begin =" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());
        System.out.println("        end =" + System.currentTimeMillis()
                + " ThreadName=" + Thread.currentThread().getName());
    }
}