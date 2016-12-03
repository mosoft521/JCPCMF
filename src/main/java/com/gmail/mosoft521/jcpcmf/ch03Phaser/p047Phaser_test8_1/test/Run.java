package com.gmail.mosoft521.jcpcmf.ch03Phaser.p047Phaser_test8_1.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p047Phaser_test8_1.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        try {
            Phaser phaser = new Phaser(3);
            ThreadA a = new ThreadA(phaser);
            a.setName("A");
            a.start();
            Thread.sleep(5000);
            a.interrupt();
            System.out.println("中断了c");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
A A1 begin=1480756451452
中断了c
 */