package com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        a.interrupt();
    }
}
/*
A begin 1480756659535
InterruptedException e
java.lang.InterruptedException
	at java.util.concurrent.Phaser.awaitAdvanceInterruptibly(Phaser.java:798)
	at com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.extthread.ThreadA.run(ThreadA.java:21)
 */