package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class offerFirst_1 {

    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        System.out.println(deque.offerFirst("anyString1"));
        System.out.println(deque.offerFirst("anyString2"));
        System.out.println(deque.offerFirst("anyString3"));
        System.out.println(deque.size());
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
/*
true
true
true
3
anyString3
anyString2
anyString1

Process finished with exit code 0
 */