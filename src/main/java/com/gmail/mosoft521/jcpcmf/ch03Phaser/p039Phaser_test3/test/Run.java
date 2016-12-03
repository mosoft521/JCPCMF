package com.gmail.mosoft521.jcpcmf.ch03Phaser.p039Phaser_test3.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p039Phaser_test3.extthread.ThreadA;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        ThreadA a = new ThreadA(phaser);
        a.start();
    }
}
/*
A  begin
A    end phase value=1
A  begin
A    end phase value=2
A  begin
A    end phase value=3
A  begin
A    end phase value=4
 */