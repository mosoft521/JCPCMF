package com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.tools.PrintTools;

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
A A1 begin=1480755551303
B A1 begin=1480755551305
C A1 begin=1480755551305
A：3
B：2
C A1   end=1480755556305
A A1   end=1480755556305
B A1   end=1480755556305
A A2 begin=1480755556305
B A2 begin=1480755556305
A A2   end=1480755556305
B A2   end=1480755556305
 */