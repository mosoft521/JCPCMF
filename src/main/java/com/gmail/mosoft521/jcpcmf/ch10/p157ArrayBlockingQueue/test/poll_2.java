package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class poll_2 {

    public static void main(String[] args) {
        try {
            ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
            System.out.println(System.currentTimeMillis());
            System.out.println(queue.poll(5, TimeUnit.SECONDS));
            System.out.println(System.currentTimeMillis());

            System.out.println(queue.offer("myString1"));
            System.out.println(queue.offer("myString2"));
            System.out.println("A begin " + System.currentTimeMillis());
            System.out.println(queue.poll(5, TimeUnit.SECONDS));
            System.out.println("A   end " + System.currentTimeMillis());
            System.out.println(queue.size());
            System.out.println("B begin " + System.currentTimeMillis());
            System.out.println(queue.poll(5, TimeUnit.SECONDS));
            System.out.println("B   end " + System.currentTimeMillis());
            System.out.println(queue.size());
            System.out.println();
            System.out.println(System.currentTimeMillis());
            System.out.println(queue.poll(5, TimeUnit.SECONDS));
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
1480837026717
null
1480837031722
true
true
A begin 1480837031722
myString1
A   end 1480837031722
1
B begin 1480837031722
myString2
B   end 1480837031722
0

1480837031722
null
1480837036723

Process finished with exit code 0
 */