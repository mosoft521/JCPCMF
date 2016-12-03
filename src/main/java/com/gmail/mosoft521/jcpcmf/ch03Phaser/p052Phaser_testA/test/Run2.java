package com.gmail.mosoft521.jcpcmf.ch03Phaser.p052Phaser_testA.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p052Phaser_testA.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        phaser.register();
        for (int i = 0; i < 3; i++) {
            ThreadA t = new ThreadA(phaser);
            t.start();
        }
        Thread.sleep(5000);
        phaser.arriveAndDeregister();
    }
}
/*
Thread-1 A1 begin=1480756882233
Thread-2 A1 begin=1480756882233
Thread-0 A1 begin=1480756882233
Thread-0 A1   end=1480756887233
Thread-1 A1   end=1480756887233
Thread-2 A1   end=1480756887233
 */