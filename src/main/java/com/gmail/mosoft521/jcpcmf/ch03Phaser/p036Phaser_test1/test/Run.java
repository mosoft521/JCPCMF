package com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.tools.PrintTools;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;

        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(phaser);
        c.setName("C");
        c.start();
    }
}
/*
B A1 begin=1480755366193
A A1 begin=1480755366197
C A1 begin=1480755366211
C A1   end=1480755371212
B A1   end=1480755371212
B A2 begin=1480755371212
A A1   end=1480755371212
C A2 begin=1480755371212
A A2 begin=1480755371212
C A2   end=1480755376212
A A2   end=1480755376212
B A2   end=1480755376212
 */