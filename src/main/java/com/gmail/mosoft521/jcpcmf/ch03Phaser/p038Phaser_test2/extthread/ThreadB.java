package com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.extthread;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p038Phaser_test2.tools.PrintTools;

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
