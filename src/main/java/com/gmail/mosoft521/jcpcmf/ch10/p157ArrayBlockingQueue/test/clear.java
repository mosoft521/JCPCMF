package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class clear {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        queue.add("myString1");
        queue.add("myString2");
        queue.add("myString3");
        queue.clear();
        System.out.println(queue.size());
    }
}
/*
0
Process finished with exit code 0
 */