package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p075Policy_CallerRunsPolicy_1.extthread;

public class MyThreadA extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("  end " + Thread.currentThread().getName()
                    + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
