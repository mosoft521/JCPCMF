package com.gmail.mosoft521.jcpcmf.ch05FutureCallable.p092RejectedExecutionHandlerTest.myrunnable;

public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    public void run() {
        System.out.println(username + " 在运行！");
    }
}
