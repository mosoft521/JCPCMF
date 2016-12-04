package com.gmail.mosoft521.jcpcmf.ch03Phaser.p043Phaser_test5.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p043Phaser_test5.extthread.MyThread;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(7);
        MyThread[] myThreadArray = new MyThread[5];
        for (int i = 0; i < myThreadArray.length; i++) {
            myThreadArray[i] = new MyThread(phaser);
            myThreadArray[i].setName("Thread" + (i + 1));
            myThreadArray[i].start();
        }
        Thread.sleep(2000);
        System.out.println("已到达：" + phaser.getArrivedParties());
        System.out.println("未到达：" + phaser.getUnarrivedParties());
    }
}
/*
Thread1 A1 begin=1480756015521
Thread2 A1 begin=1480756015521
Thread5 A1 begin=1480756015521
Thread3 A1 begin=1480756015522
Thread4 A1 begin=1480756015522
已到达：5
未到达：2
 */