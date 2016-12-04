package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class offerFirst_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        System.out.println(deque.offerFirst("anyString1"));
        System.out.println(deque.offerFirst("anyString2"));
        System.out.println(deque.offerFirst("anyString3"));
        System.out.println(deque.offerFirst("anyString4"));
        System.out.println(deque.size());
    }
}
/*
true
true
true
false
3
Process finished with exit code 0
 */