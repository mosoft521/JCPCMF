package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p017Semaphore_Pool_List.extthread;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p017Semaphore_Pool_List.tools.ListPool;

public class MyThread extends Thread {

    private ListPool listPool;

    public MyThread(ListPool listPool) {
        super();
        this.listPool = listPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName() + " 取得值 " + getString);
            listPool.put(getString);
        }
    }
}