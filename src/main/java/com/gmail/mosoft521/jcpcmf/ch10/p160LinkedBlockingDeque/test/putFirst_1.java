package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

public class putFirst_1 {

    public static void main(String[] args) {
        try {
            LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
            deque.putFirst("anyString1");
            deque.putFirst("anyString2");
            deque.putFirst("anyString3");
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
anyString3
anyString2
anyString1

Process finished with exit code 0
 */