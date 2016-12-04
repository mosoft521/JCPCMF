package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class takeFirst_1 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
            deque.addLast("anyString1");
            deque.addLast("anyString2");
            deque.addLast("anyString3");
            System.out.println(deque.takeFirst());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
anyString1

Process finished with exit code 0
 */