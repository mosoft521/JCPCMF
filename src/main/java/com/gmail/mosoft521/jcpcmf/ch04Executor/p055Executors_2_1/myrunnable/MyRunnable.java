package com.gmail.mosoft521.jcpcmf.ch04Executor.p055Executors_2_1.myrunnable;

public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " username="
                + username + " begin " + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " username="
                + username + "   end " + System.currentTimeMillis());
    }
}
