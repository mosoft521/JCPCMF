package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p010SemaphoreFairTest.test.run;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p010SemaphoreFairTest.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p010SemaphoreFairTest.myservice.MyService;

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
ThreadName=Thread-1启动了！
ThreadName=Thread-2启动了！
ThreadName=Thread-3启动了！
ThreadName=Thread-4启动了！
ThreadName=Thread-0启动了！
ThreadName=Thread-1
ThreadName=Thread-3
ThreadName=Thread-2
ThreadName=Thread-4
ThreadName=Thread-0
 */