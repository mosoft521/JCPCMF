package com.gmail.mosoft521.jcpcmf.ch03Phaser.p052Phaser_testA.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p052Phaser_testA.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        for (int i = 0; i < 3; i++) {
            ThreadA t = new ThreadA(phaser);
            t.start();
        }
    }
}
/*
Thread-0 A1 begin=1480756851421
Thread-2 A1 begin=1480756851423
Thread-1 A1 begin=1480756851427
Thread-1 A1   end=1480756851427
Thread-2 A1   end=1480756851427
Thread-0 A1   end=1480756851427
 */