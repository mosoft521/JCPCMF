package com.gmail.mosoft521.jcpcmf.ch01Exchange.p020Exchanger_2.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Exchange.p020Exchanger_2.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Exchange.p020Exchanger_2.extthread.ThreadB;

import java.util.concurrent.Exchanger;

public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA a = new ThreadA(exchanger);
        ThreadB b = new ThreadB(exchanger);
        a.start();
        b.start();
    }
}
/*
在线程B中得到线程A的值=中国人A
在线程A中得到线程B的值=中国人B
 */