package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test19 {
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
        iterator.remove();
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " " + iterator.nextIndex());
        }
    }
}
/*
a 1
c 2
d 3
e 4
Process finished with exit code 0
 */