package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p078ThreadPoolExecutor_after_before.myrunnable;

public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        try {
            System.out.println("打印了！begin " + username + " "
                    + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println("打印了！      end " + username + " "
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
