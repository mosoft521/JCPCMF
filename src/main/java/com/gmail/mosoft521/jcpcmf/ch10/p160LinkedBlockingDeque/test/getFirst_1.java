package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class getFirst_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.addFirst("anyString1");
        deque.addFirst("anyString2");
        deque.addFirst("anyString3");
        System.out.println(deque.getFirst());
    }
}
/*
anyString3
Process finished with exit code 0
 */