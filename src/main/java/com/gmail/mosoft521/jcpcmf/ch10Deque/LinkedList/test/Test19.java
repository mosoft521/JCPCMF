package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test19 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(0, "y");
        list.push("x");// 添加到头部
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
x
y
1
2
3
Process finished with exit code 0
 */