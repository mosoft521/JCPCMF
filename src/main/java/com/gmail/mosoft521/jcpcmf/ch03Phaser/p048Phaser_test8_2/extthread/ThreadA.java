package com.gmail.mosoft521.jcpcmf.ch03Phaser.p048Phaser_test8_2.extthread;

import java.util.concurrent.Phaser;

public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin="
                    + System.currentTimeMillis());
            phaser.awaitAdvanceInterruptibly(0);// 符合栏数就wait
            System.out.println(Thread.currentThread().getName() + " A1   end="
                    + System.currentTimeMillis());
        } catch (InterruptedException e) {
            System.out.println("进入catch");
            e.printStackTrace();
        }
    }
}
