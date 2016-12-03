package com.gmail.mosoft521.jcpcmf.ch03Phaser.p048Phaser_test8_2.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p048Phaser_test8_2.extthread.ThreadA;

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
A A1 begin=1480756506750
中断了c
进入catch
java.lang.InterruptedException
	at java.util.concurrent.Phaser.awaitAdvanceInterruptibly(Phaser.java:760)
	at com.gmail.mosoft521.jcpcmf.ch03Phaser.p048Phaser_test8_2.extthread.ThreadA.run(ThreadA.java:18)

 */