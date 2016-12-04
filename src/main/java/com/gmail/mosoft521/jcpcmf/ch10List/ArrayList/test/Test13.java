package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test13 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list.size() + " " + list.isEmpty());
        list.clear();
        System.out.println(list.size() + " " + list.isEmpty());
    }
}
/*
5 false
0 true
Process finished with exit code 0
 */