package com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.extthread;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p036Phaser_test1.tools.PrintTools;

import java.util.concurrent.Phaser;

public class ThreadB extends Thread {

    private Phaser phaser;

    public ThreadB(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void run() {
        PrintTools.methodA();
    }

}
