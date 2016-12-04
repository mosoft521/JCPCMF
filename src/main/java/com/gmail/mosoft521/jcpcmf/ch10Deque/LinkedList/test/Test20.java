package com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test;

import java.util.LinkedList;

public class Test20 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.getLast());
    }
}
/*
Exception in thread "main" java.util.NoSuchElementException
	at java.util.LinkedList.getLast(LinkedList.java:257)
	at com.gmail.mosoft521.jcpcmf.ch10Deque.LinkedList.test.Test20.main(Test20.java:9)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */