package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test8 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        ArrayList newlist = new ArrayList();
        newlist.add("a");
        newlist.add("b");
        newlist.add("c");

        System.out.println(list.containsAll(newlist));
    }
}
/*
true

Process finished with exit code 0
 */