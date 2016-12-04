package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test18 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        ListIterator iterator = list.listIterator();
        iterator.next();
        iterator.next();
        iterator.set("addString");
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " " + iterator.nextIndex());
        }
    }
}
/*
a 1
addString 2
c 3
d 4
e 5
Process finished with exit code 0
 */