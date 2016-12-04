package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class isEmpty {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        System.out.println(queue.isEmpty());
        queue.add("myString1");
        queue.add("myString2");
        queue.add("myString3");
        queue.add("myString4");
        System.out.println(queue.isEmpty());
    }
}
/*
true
false

Process finished with exit code 0
 */