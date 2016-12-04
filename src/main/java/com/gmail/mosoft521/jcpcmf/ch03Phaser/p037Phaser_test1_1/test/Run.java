package com.gmail.mosoft521.jcpcmf.ch03Phaser.p037Phaser_test1_1.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p037Phaser_test1_1.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p037Phaser_test1_1.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p037Phaser_test1_1.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p037Phaser_test1_1.tools.PrintTools;

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
A A1 begin=1480755394750
B A1 begin=1480755394752
C A1 begin=1480755394757
A A1   end=1480755399758
A A2 begin=1480755399758
C A1   end=1480755399758
B A1   end=1480755399758
B A2 begin=1480755399759
Process finished with exit code 1
 */