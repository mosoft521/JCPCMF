package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class addFirst_1 {

    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.addFirst("anyString1");
        deque.addFirst("anyString2");
        deque.addFirst("anyString3");
        System.out.println(deque.size());
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
3
anyString3
anyString2
anyString1

Process finished with exit code 0
 */