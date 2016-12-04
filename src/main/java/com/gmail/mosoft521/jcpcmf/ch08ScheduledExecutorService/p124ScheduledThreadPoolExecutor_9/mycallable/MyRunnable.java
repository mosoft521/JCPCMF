package com.gmail.mosoft521.jcpcmf.ch08ScheduledExecutorService.p124ScheduledThreadPoolExecutor_9.mycallable;

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
            System.out.println("main run ");
            while (true) {
                if (Thread.currentThread().isInterrupted() == true) {
                    throw new InterruptedException();
                }
                System.out.println("run! username=" + username + " "
                        + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("中断了！");
        }
    }
}