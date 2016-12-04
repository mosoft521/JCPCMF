package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p066ThreadPoolExecutor_4.myrunnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin "
                    + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "   end "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
