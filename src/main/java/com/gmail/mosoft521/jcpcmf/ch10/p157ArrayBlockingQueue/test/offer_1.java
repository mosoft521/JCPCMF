package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class offer_1 {
    public static void main(String[] args) {
        // offer无阻塞效果，未成功添加则返回false
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        System.out.println(queue.offer("myString1"));
        System.out.println(queue.offer("myString2"));
        System.out.println(queue.offer("myString3"));
        System.out.println(queue.size());
        System.out.println(queue.offer("myString4"));
        System.out.println(queue.size());
    }
}
/*
true
true
true
3
false
3
Process finished with exit code 0
 */