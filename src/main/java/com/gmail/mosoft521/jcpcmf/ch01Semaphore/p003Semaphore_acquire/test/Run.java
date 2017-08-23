package com.gmail.mosoft521.jcpcmf.ch01Semaphore.p003Semaphore_acquire.test;

import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p003Semaphore_acquire.extthread.ThreadA;
import com.gmail.mosoft521.jcpcmf.ch01Semaphore.p003Semaphore_acquire.service.Service;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(service);
            a[i].start();
        }
    }
}
/*
todo:这个列子演示了Semaphore其实并发并不安全,可以使用jcstress来测试下
Thread-2 begin timer=1480666799883
Thread-3 begin timer=1480666799883
Thread-1 begin timer=1480666799883
Thread-0 begin timer=1480666799884
Thread-5 begin timer=1480666799884
Thread-2 停止了9秒
Thread-5 停止了0秒
Thread-0 停止了2秒
Thread-1 停止了4秒
Thread-3 停止了0秒
Thread-3   end timer=1480666800436
Thread-6 begin timer=1480666800436
Thread-6 停止了2秒
Thread-5   end timer=1480666800865
Thread-7 begin timer=1480666800865
Thread-7 停止了0秒
Thread-7   end timer=1480666801541
Thread-9 begin timer=1480666801541
Thread-9 停止了2秒
Thread-0   end timer=1480666802890
Thread-4 begin timer=1480666802890
Thread-4 停止了3秒
Thread-6   end timer=1480666802917
Thread-8 begin timer=1480666802917
Thread-8 停止了0秒
Thread-8   end timer=1480666803659
Thread-9   end timer=1480666803996
Thread-1   end timer=1480666804652
Thread-4   end timer=1480666806116
Thread-2   end timer=1480666808944
-----------------------------
Thread-1 begin timer=1503449903109
Thread-2 begin timer=1503449903109
Thread-0 begin timer=1503449903109
Thread-2 停止了2秒
Thread-0 停止了0秒
Thread-1 停止了0秒
Thread-4 begin timer=1503449903110
Thread-4 停止了2秒
Thread-5 begin timer=1503449903110
Thread-5 停止了8秒
Thread-0   end timer=1503449903244
Thread-6 begin timer=1503449903244
Thread-6 停止了8秒
Thread-1   end timer=1503449904055
Thread-3 begin timer=1503449904055
Thread-3 停止了1秒
Thread-3   end timer=1503449905315
Thread-7 begin timer=1503449905315
Thread-7 停止了9秒
Thread-2   end timer=1503449905806
Thread-9 begin timer=1503449905806
Thread-9 停止了7秒
Thread-4   end timer=1503449906015
Thread-8 begin timer=1503449906015
Thread-8 停止了2秒
Thread-8   end timer=1503449908279
Thread-5   end timer=1503449912063
Thread-6   end timer=1503449912090
Thread-9   end timer=1503449912815
Thread-7   end timer=1503449915102
 */