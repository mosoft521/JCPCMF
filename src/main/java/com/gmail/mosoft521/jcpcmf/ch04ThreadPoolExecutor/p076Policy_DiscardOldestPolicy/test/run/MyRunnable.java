package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p076Policy_DiscardOldestPolicy.test.run;

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

    public void run() {
        try {
            System.out.println(username + " run");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
