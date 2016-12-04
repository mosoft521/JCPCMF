package com.gmail.mosoft521.jcpcmf.ch03Phaser.p041Phaser_test4.test;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(5);
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
    }
}
/*
5
6
7
8
9
 */