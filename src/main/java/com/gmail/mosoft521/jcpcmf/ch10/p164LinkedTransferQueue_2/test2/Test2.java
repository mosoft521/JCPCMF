package com.gmail.mosoft521.jcpcmf.ch10.p164LinkedTransferQueue_2.test2;

public class Test2 {
    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();
            ThreadB2 b = new ThreadB2(service);
            b.setName("b");
            b.start();
            Thread.sleep(3000);
            System.out.println("队列中的元素个数为：" + service.queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
b beginB 1480839216937
队列中的元素个数为：1
阻塞住了？
Process finished with exit code 1
 */