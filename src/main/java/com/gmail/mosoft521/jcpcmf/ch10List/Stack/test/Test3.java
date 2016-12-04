package com.gmail.mosoft521.jcpcmf.ch10List.Stack.test;

import java.util.Stack;

public class Test3 {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println();

        stack.push("top");

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println();
        System.out.println(stack.peek());
    }

}
/*
1
2
3
4

1
2
3
4
top

top

Process finished with exit code 0
 */