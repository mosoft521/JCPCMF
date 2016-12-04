package com.gmail.mosoft521.jcpcmf.ch10.p167LinkedTransferQueue_5.test2;

public class Test2 {

    public static void main(String[] args) {
        try {
            MyServiceB service = new MyServiceB();

            ThreadB1 a = new ThreadB1(service);
            a.setName("a");
            a.start();

            Thread.sleep(500);

            System.out.println("A处 队列大小：" + service.queue.size());

            Thread.sleep(8000);

            System.out.println("A处 队列大小：" + service.queue.size());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
a beginA 1480839435018
A处 队列大小：1
返回值为：false
a   endA 1480839440020
A处 队列大小：0

Process finished with exit code 0
 */