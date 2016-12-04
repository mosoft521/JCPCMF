package com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.test;

import com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch03Phaser.p040Phaser_onAdvance.service.MyService;

import java.util.concurrent.Phaser;

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out
                        .println("protected boolean onAdvance(int phase, int registeredParties)被调用！");
                return false;
                // 返回true不等待了，Phaser呈无效/销毁的状态
                // 返回false则Phaser继续工作
            }
        };
        MyService service = new MyService(phaser);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
/*
A  begin ThreadName=B                              1480755889760
A  begin ThreadName=A                              1480755889780
protected boolean onAdvance(int phase, int registeredParties)被调用！
A    end  ThreadName=B end phase value=1 1480755894762
A    end  ThreadName=A end phase value=1 1480755894762
B  begin ThreadName=B                              1480755894762
B  begin ThreadName=A                              1480755894762
protected boolean onAdvance(int phase, int registeredParties)被调用！
B    end  ThreadName=B end phase value=2 1480755899762
B    end  ThreadName=A end phase value=2 1480755899762
C  begin ThreadName=B                              1480755899762
C  begin ThreadName=A                              1480755899762
protected boolean onAdvance(int phase, int registeredParties)被调用！
C    end  ThreadName=B end phase value=3 1480755904762
C    end  ThreadName=A end phase value=3 1480755904762
 */