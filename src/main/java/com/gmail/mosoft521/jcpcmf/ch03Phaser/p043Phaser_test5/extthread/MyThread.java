package com.gmail.mosoft521.jcpcmf.ch03Phaser.p043Phaser_test5.extthread;

import java.util.concurrent.Phaser;

public class MyThread extends Thread {

    private Phaser phaser;

    public MyThread(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " A1 begin="
                + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A1   end="
                + System.currentTimeMillis());
    }

}
