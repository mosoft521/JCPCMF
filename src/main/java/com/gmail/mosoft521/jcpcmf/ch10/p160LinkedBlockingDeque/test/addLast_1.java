package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class addLast_1 {

    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.addLast("anyString1");
        deque.addLast("anyString2");
        deque.addLast("anyString3");
        System.out.println(deque.size());
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
/*
3
anyString1
anyString2
anyString3

Process finished with exit code 0
 */