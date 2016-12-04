package com.gmail.mosoft521.jcpcmf.ch10.p161SynchronousQueue.test;

import java.util.concurrent.SynchronousQueue;

public class Test1 {

    public static void main(String[] args) {
        try {
            SynchronousQueue queue = new SynchronousQueue();
            System.out.println("step1");
            queue.put("anyString");
            System.out.println("step2");
            System.out.println(queue.take());
            System.out.println("step3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
step1
阻塞住了？
Process finished with exit code 1
 */