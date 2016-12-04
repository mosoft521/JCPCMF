package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test13 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list.getFirst());
        System.out.println(list.element());
        System.out.println(list.peek());

    }
}
/*
1
1
1

Process finished with exit code 0
 */