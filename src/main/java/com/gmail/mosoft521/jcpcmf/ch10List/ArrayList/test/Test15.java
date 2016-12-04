package com.gmail.mosoft521.jcpcmf.ch10List.ArrayList.test;

import java.util.ArrayList;

public class Test15 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("a");

        System.out.println(list.lastIndexOf("b"));

    }
}
/*
3

Process finished with exit code 0
 */