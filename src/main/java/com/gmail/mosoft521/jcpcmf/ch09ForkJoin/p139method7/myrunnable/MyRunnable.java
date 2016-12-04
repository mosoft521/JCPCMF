package com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.myrunnable;

import com.gmail.mosoft521.jcpcmf.ch09ForkJoin.p139method7.entity.Userinfo;

public class MyRunnable implements Runnable {

    private Userinfo userinfo;

    public MyRunnable(Userinfo userinfo) {
        super();
        this.userinfo = userinfo;
    }

    public void run() {
        try {
            userinfo.setUsername("设置的值");
            System.out.println("已经设置完结！");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
