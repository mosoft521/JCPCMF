package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class putLast_2 {
    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
            deque.putLast("anyString1");
            System.out.println("A");
            deque.putLast("anyString2");
            System.out.println("B");
            deque.putLast("anyString3");
            System.out.println("C");
            System.out.println(deque.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
A
B
阻塞住了？
Process finished with exit code 1
 */