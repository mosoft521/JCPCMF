package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class removeLastOccurrence_1 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(10);
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        deque.addLast("a");
        deque.addLast("d");
        deque.addLast("e");
        deque.addLast("d");
        System.out.println(deque.removeLastOccurrence("d"));
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
true
a
b
c
a
d
e
Process finished with exit code 0
 */