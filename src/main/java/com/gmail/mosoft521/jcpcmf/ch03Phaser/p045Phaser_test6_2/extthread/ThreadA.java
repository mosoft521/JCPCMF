package com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.extthread;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.service.MyService;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethodA();
    }
}
