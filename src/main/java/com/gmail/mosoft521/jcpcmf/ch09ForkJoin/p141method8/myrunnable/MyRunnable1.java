package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p141method8.myrunnable;

public class MyRunnable1 implements Runnable {

    public void run() {
        try {
            System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("  end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}