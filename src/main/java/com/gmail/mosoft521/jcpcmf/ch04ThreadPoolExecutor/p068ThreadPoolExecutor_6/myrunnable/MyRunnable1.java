package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p068ThreadPoolExecutor_6.myrunnable;

public class MyRunnable1 implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
