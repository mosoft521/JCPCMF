package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p115ScheduledThreadPoolExecutor_2.mycallable;

public class MyRunnableA implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("runnableA begin "
                    + Thread.currentThread().getName() + " "
                    + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("runnableA   end "
                    + Thread.currentThread().getName() + " "
                    + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
