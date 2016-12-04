package com.gmail.mosoft521.jcpcmf.ch10List.Stack.test;

import java.util.Stack;

public class Test4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        System.out.println(stack.pop() + " 被删除了");
        System.out.println(stack.pop() + " 被删除了");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println("剩下的：" + stack.get(i));
        }
    }
}
/*
4 被删除了
3 被删除了
剩下的：1
剩下的：2
Process finished with exit code 0
 */