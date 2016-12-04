package com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test;

import java.util.concurrent.LinkedBlockingDeque;

public class push_2 {

    public static void main(String[] args) {
        LinkedBlockingDeque deque = new LinkedBlockingDeque(2);
        deque.push("anyString1");
        deque.push("anyString2");
        deque.push("anyString3");
        System.out.println(deque.size());
    }

}
/*
Exception in thread "main" java.lang.IllegalStateException: Deque full
	at java.util.concurrent.LinkedBlockingDeque.addFirst(LinkedBlockingDeque.java:326)
	at java.util.concurrent.LinkedBlockingDeque.push(LinkedBlockingDeque.java:770)
	at com.gmail.mosoft521.jcpcmf.ch10.p160LinkedBlockingDeque.test.push_2.main(push_2.java:11)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)

Process finished with exit code 1
 */