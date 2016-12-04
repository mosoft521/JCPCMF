package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class descendingIterator {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        deque.addLast("anyString1");
        deque.addLast("anyString2");
        deque.addLast("anyString3");
        Iterator iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
anyString3
anyString2
anyString1
Process finished with exit code 0
 */