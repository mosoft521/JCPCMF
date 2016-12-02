package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p009twoMethodTest.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p009twoMethodTest.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p009twoMethodTest.myservice.MyService;

public class Run {

    public static void main(String[] args) {
        MyService service = new MyService();

        MyThread firstThread = new MyThread(service);
        firstThread.start();

        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();
        }
    }
}
/*
还有大约4个线程在等待
是否有线程正在等待信号量呢？true
还有大约3个线程在等待
是否有线程正在等待信号量呢？true
还有大约2个线程在等待
是否有线程正在等待信号量呢？true
还有大约1个线程在等待
是否有线程正在等待信号量呢？true
还有大约0个线程在等待
是否有线程正在等待信号量呢？false
 */