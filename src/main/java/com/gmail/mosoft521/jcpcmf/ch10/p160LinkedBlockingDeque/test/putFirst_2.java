package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class putFirst_2 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
            deque.putFirst("anyString1");
            System.out.println("A1");
            deque.putFirst("anyString2");
            System.out.println("A2");
            deque.putFirst("anyString3");
            System.out.println("A3");
            System.out.println(deque.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
A1
A2
阻塞住了？
Process finished with exit code 1
 */