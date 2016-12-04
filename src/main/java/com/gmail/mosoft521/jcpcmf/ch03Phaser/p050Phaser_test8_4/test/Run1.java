package com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
    }
}
/*
A begin 1480756610183
TimeoutException e
java.util.concurrent.TimeoutException
	at java.util.concurrent.Phaser.awaitAdvanceInterruptibly(Phaser.java:800)
	at com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.extthread.ThreadA.run(ThreadA.java:21)
 */