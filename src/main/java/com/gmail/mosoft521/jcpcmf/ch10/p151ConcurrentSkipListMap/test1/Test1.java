package com.gmail.mosoft521.jcpcmf.ch10.p151ConcurrentSkipListMap.test1;

public class Test1 {
    public static void main(String[] args) {
        MyService1 service = new MyService1();
        ThreadA a = new ThreadA(service);
        ThreadA b = new ThreadA(service);
        a.start();
        b.start();
    }
}
/*
1 username1 value1
2 username2 value2
3 username3 value3
4 username4 value4
5 username5 value5
Process finished with exit code 0
 */