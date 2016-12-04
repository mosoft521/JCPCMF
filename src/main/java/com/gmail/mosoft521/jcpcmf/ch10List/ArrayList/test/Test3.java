package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List insertList = new ArrayList();
        insertList.add("a");
        insertList.add("b");
        insertList.add("c");
        ArrayList list = new ArrayList();
        list.add("大中国1");
        list.add("大中国2");
        list.addAll(insertList);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
大中国1
大中国2
a
b
c
Process finished with exit code 0
 */