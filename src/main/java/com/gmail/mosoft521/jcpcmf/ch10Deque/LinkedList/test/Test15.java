package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test15 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.poll());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
null
Process finished with exit code 0
 */