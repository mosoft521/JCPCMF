package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class remainingCapacity {

    public static void main(String[] args) {
        // 返回在无阻塞的理想情况下（不存在内存或资源约束）此队列能接受的元素数量。
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
        System.out.println(queue.add("myString1"));
        System.out.println(queue.add("myString2"));
        System.out.println(queue.add("myString3"));
        System.out.println(queue.remainingCapacity());

    }
}
/*
true
true
true
2

Process finished with exit code 0
 */