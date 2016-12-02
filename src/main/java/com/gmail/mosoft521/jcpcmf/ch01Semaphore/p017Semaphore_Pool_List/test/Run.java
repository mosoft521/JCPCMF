package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p017Semaphore_Pool_List.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p017Semaphore_Pool_List.extthread.MyThread;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p017Semaphore_Pool_List.tools.ListPool;

public class Run {

    public static void main(String[] args) {

        ListPool pool = new ListPool();

        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(pool);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }

    }
}
/*
...
 */