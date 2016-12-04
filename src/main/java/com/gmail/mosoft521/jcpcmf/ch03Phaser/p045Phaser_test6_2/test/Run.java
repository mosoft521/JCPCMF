package com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.extthread.ThreadC;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p045Phaser_test6_2.service.MyService;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        MyService service = new MyService(phaser);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
/*
A begin A1 1480756195946
C begin A1 1480756195947
C   end A1 1480756195947
C begin A2 1480756195947
C   end A2 1480756195947
C begin A3 1480756195947
C   end A3 1480756195947
B begin A1 1480756195947
0
1
 */