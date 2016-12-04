package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class removeLastOccurrence_2 {

    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(10);
        System.out.println(deque.removeLastOccurrence("d"));
    }

}
/*
false

Process finished with exit code 0
 */