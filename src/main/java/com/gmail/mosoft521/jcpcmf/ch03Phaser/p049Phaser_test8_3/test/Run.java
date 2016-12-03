package com.gmail.mosoft521.jcpcmf.ch03Phaser.p049Phaser_test8_3.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p049Phaser_test8_3.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
    }
}
/*
A A1 begin=1480756555958
A A1   end=1480756555959
 */