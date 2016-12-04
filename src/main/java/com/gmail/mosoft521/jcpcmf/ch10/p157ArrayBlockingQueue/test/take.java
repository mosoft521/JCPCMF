package com.gmail.mosoft521.jcpcmf.ch10.p157ArrayBlockingQueue.test;

import java.util.concurrent.ArrayBlockingQueue;

public class take {
    public static void main(String[] args) {
        try {
            ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
            System.out.println("begin " + System.currentTimeMillis());
            System.out.println(queue.take());
            System.out.println("  end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
begin 1480837271741
阻塞住了...
Process finished with exit code 1
 */