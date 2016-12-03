package com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.extthread.ThreadB;

import java.util.concurrent.Phaser;

public class Run2 {
    public static void main(String[] args) {
        try {
            Phaser phaser = new Phaser(3);
            ThreadA a = new ThreadA(phaser);
            a.setName("A");
            a.start();
            ThreadB b = new ThreadB(phaser);
            b.setName("B");
            b.start();
            Thread.sleep(1000);
            phaser.forceTermination();
            System.out.println(phaser.isTerminated());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
A A1 begin=1480756780343
B A1 begin=1480756780345
true
A A1   end=1480756781344
B A1   end=1480756781344
 */