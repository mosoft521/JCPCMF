package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class addLast_2 {
    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
        deque.addLast("anyString1");
        deque.addLast("anyString2");
        deque.addLast("anyString3");
        System.out.println(deque.size());
    }
}
/*
Exception in thread "main" java.lang.IllegalStateException: Deque full
	at java.util.concurrent.LinkedBlockingDeque.addLast(LinkedBlockingDeque.java:335)
	at com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test.addLast_2.main(addLast_2.java:11)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
Process finished with exit code 1
 */