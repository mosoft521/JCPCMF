package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class add_1 {
    public static void main(String[] args) {
        // put有阻塞效果，队列满时阻塞
        // add没有阻塞效果，队列满时报异常
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.add("myString1"));
        System.out.println(queue.add("myString2"));
        System.out.println(queue.size());
    }
}
/*
true
true
2
Process finished with exit code 0
 */