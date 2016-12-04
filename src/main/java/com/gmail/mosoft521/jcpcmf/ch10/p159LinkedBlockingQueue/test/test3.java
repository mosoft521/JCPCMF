package com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.extthread.ThreadB;
import com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.service.MyServiceB;

public class test3 {

    public static void main(String[] args) throws InterruptedException {
        MyServiceB service = new MyServiceB();
        for (int i = 0; i < 100; i++) {
            ThreadB a = new ThreadB(service);
            a.start();
        }
        Thread.sleep(10000);
        System.out.println(service.queue.size());
    }
}
/*
...
z
z
z
0

Process finished with exit code 0
 */