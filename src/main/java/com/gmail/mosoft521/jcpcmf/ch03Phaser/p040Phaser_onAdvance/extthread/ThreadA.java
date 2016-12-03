package com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.extthread;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.service.MyService;

public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        super();
        this.myService = myService;
    }

    public void run() {
        myService.testMethod();

    }

}
