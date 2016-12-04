package com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p051Phaser_test9.extthread.ThreadB;

import java.util.concurrent.Phaser;

public class Run1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();
    }
}
/*
A A1 begin=1480756716691
B A1 begin=1480756716692
Process finished with exit code 1
 */