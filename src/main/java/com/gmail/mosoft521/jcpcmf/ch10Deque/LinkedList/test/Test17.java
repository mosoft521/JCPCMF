package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test17 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.pop());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
Exception in thread "main" java.util.NoSuchElementException
	at java.util.LinkedList.removeFirst(LinkedList.java:270)
	at java.util.LinkedList.pop(LinkedList.java:801)
	at com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test.Test17.main(Test17.java:9)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

Process finished with exit code 1
 */