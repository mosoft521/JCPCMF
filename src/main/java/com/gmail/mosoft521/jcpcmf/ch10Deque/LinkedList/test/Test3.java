package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.Iterator;
import java.util.LinkedList;

public class Test3 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
/*
3
2
1

Process finished with exit code 0
 */