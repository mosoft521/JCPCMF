package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable;

public class MyRunnable2 implements Runnable {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
