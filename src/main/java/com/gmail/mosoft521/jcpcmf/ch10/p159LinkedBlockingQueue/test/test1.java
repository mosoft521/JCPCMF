package com.gmail.mosoft521.jcpcmf.ch10.p159LinkedBlockingQueue.test;

import java.util.concurrent.LinkedBlockingQueue;

public class test1 {
    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue();
        for (int i = 0; i < 5000; i++) {
            queue.add("anyString" + (i + 1));
        }
        System.out.println(queue.size());
    }
}
/*
5000
Process finished with exit code 0
 */