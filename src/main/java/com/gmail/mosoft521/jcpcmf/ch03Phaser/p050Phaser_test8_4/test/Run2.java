package com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p050Phaser_test8_4.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        phaser.arrive();
        Thread.sleep(1000);
        phaser.arrive();
        Thread.sleep(1000);
        phaser.arrive();
        System.out.println(System.currentTimeMillis());
    }
}
/*
A begin 1480756636553
1480756639555
A   end 1480756639555
 */