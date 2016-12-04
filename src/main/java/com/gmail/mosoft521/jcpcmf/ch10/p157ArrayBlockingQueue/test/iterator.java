package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class iterator {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        queue.add("myString1");
        queue.add("myString2");
        queue.add("myString3");
        queue.add("myString4");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
myString1
myString2
myString3
myString4

Process finished with exit code 0
 */