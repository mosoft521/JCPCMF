package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p081runnable_asynchronized_test.myrunnable;

public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(username);
    }

}
