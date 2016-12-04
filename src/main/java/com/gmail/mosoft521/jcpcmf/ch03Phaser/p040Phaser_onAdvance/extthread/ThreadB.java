package com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.extthread;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.service.MyService;

public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    public void run() {
        myService.testMethod();
    }
}
