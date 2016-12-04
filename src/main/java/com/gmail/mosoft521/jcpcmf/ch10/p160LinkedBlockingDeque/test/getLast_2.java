package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class getLast_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(3);
        System.out.println(deque.getLast());
    }
}
/*
Exception in thread "main" java.util.NoSuchElementException
	at java.util.concurrent.LinkedBlockingDeque.getLast(LinkedBlockingDeque.java:562)
	at com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test.getLast_2.main(getLast_2.java:9)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */