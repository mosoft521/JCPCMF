package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class peekLast_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        System.out.println(deque.peekLast());
    }
}
/*
null
Process finished with exit code 0
 */