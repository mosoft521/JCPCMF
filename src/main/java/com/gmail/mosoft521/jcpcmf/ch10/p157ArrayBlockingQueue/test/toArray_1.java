package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class toArray_1 {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(4);
        System.out.println(queue.add(1));
        System.out.println(queue.add(2));
        System.out.println(queue.add(3));
        System.out.println(queue.add(4));
        Object[] objectArray = queue.toArray();
        for (int i = 0; i < objectArray.length; i++) {
            System.out.println(Integer.parseInt(objectArray[i].toString()) + 100);
        }
    }
}
/*
true
true
true
true
101
102
103
104
Process finished with exit code 0
 */