package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p145method13.myrunnable;

public class MyRunnable1 implements Runnable {
    public void run() {
        try {
            System.out.println("begin " + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("  end " + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
