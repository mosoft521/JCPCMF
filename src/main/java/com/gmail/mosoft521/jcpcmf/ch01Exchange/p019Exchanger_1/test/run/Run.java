package com.gmail.mosoft521.jcpcmf.ch01Exchange.p019Exchanger_1.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Exchange.p019Exchanger_1.extthread.ThreadA;

import java.util.concurrent.Exchanger;

public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA a = new ThreadA(exchanger);
        a.start();
        System.out.println("main end!");
    }
}
/*
main end!

 */