package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test16 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("a");
        ListIterator iterator = list.listIterator();
        System.out.println(iterator);
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " " + iterator.nextIndex());
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous() + " "
                    + iterator.previousIndex());
        }
    }
}
/*
java.util.ArrayList$ListItr@1b6d3586
a 1
b 2
c 3
b 4
a 5
a 3
b 2
c 1
b 0
a -1
Process finished with exit code 0
 */