package com.gmail.mosoft521.jcpcmf.ch10List.Stack.test;

import java.util.EnumSet;
import java.util.Stack;

public class Test1 {

    public static void main(String[] args) {
        Stack vector = new Stack();
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");

        System.out.println(vector.isEmpty());
        vector.clear();
        System.out.println(vector.isEmpty());

        EnumSet abc;

    }

}
/*
false
true

Process finished with exit code 0
 */