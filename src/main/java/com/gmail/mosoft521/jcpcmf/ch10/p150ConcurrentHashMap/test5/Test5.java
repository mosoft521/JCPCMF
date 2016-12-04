package com.gmail.mosoft521.jcpcmf.ch10.p150ConcurrentHashMap.test5;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        try {
            MyService5 myService = new MyService5();
            Thread5A a = new Thread5A(myService);
            a.start();
            Thread.sleep(1000);
            Thread5B b = new Thread5B(myService);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 成功但不支持排序
        // LinkedHashMap虽然能支持顺序性，但又不支持并发
    }
}
/*
key1
key2
key5
key3
key4
z
Process finished with exit code 0
 */