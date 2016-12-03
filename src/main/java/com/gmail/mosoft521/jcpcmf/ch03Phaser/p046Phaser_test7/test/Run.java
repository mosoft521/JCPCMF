package com.gmail.mosoft521.jcpcmf.ch03Phaser.p046Phaser_test7.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p046Phaser_test7.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p046Phaser_test7.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p046Phaser_test7.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p046Phaser_test7.extthread.ThreadD;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(phaser);
        c.setName("C");
        c.start();

        ThreadD d = new ThreadD(phaser);
        d.setName("D");
        d.start();
    }
}
/*
B A1 begin=1480756286381
A A1 begin=1480756286385
C A1 begin=1480756286385
D A1 begin=1480756286386
D A1   end=1480756291386
C A1   end=1480756291386
B A1   end=1480756291386
A A1   end=1480756291386
 */