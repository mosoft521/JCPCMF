package com.gmail.mosoft521.jcpcmf.ch01Exchange.p021Exchanger_3.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Exchange.p021Exchanger_3.extthread.ThreadA;

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
java.util.concurrent.TimeoutException
	at java.util.concurrent.Exchanger.exchange(Exchanger.java:626)
	at com.gmail.mosoft521.jcpcmf.ch01Exchange.p021Exchanger_3.extthread.ThreadA.run(ThreadA.java:20)
 */