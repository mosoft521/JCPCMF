package com.gmail.mosoft521.jcpcmf.ch03Phaser.p047Phaser_test8_1.extthread;

import java.util.concurrent.Phaser;

public class ThreadA extends Thread {

    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " A1 begin="
                + System.currentTimeMillis());
        phaser.awaitAdvance(0);
        System.out.println(Thread.currentThread().getName() + " A1   end="
                + System.currentTimeMillis());
    }

}
