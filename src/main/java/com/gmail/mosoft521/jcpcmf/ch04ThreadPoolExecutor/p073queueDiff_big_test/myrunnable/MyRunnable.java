package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p073queueDiff_big_test.myrunnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("begin " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
