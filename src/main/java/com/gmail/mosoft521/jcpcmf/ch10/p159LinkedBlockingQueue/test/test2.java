package com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.test;

import com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.service.MyServiceA;

public class test2 {

    public static void main(String[] args) throws InterruptedException {
        // ��ʵ��֤��ArrayList�Ƿ��̰߳�ȫ��
        MyServiceA service = new MyServiceA();
        for (int i = 0; i < 100; i++) {
            ThreadA a = new ThreadA(service);
            a.start();
        }
        Thread.sleep(20000);
        System.out.println(service.list.size());
    }
}
/*
...
z
z
z
z
z
z
z
z
5

Process finished with exit code 0
 */