package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test6 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        LinkedList deleteList = new LinkedList();
        deleteList.add("1");
        deleteList.add("2");
        deleteList.add("3");
        list.removeAll(deleteList);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
4
5
Process finished with exit code 0
 */