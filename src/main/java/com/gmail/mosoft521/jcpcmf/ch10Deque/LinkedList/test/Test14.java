package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test14 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.offer("2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
1
2
Process finished with exit code 0
 */