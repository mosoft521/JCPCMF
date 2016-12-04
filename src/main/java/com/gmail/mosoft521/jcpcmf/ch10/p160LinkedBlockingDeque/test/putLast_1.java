package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class putLast_1 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
            deque.putLast("anyString1");
            deque.putLast("anyString2");
            deque.putLast("anyString3");
            System.out.println(deque.size());
            Iterator iterator = deque.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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