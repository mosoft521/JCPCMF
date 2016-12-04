package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class peek {

    public static void main(String[] args) {
        // peek:
        // 检索，但是不移除此队列的头，如果此队列为空，则返回 null。
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.offer("myString1"));
        System.out.println(queue.offer("myString2"));
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
    }
}
/*
null
true
true
myString1
myString1
myString1
myString1

Process finished with exit code 0
 */