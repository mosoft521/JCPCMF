package com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p075Policy_CallerRunsPolicy_2.test;

import com.gmail.mosoft521.jcpcmf.ch04ThreadPoolExecutor.p075Policy_CallerRunsPolicy_2.extthread.MyThreadA;

public class Run {
    public static void main(String[] args) {
        MyThreadA a = new MyThreadA();
        a.setName("AA");
        a.start();
        System.out.println("main end!");
    }
}
/*
main end!
a begin AA 1480772311187
  end pool-1-thread-1 1480772316187
  end pool-1-thread-2 1480772316188
  end pool-1-thread-3 1480772316188
  end AA 1480772316188
a   end AA 1480772316188
a   end 1480772316188
  end pool-1-thread-1 1480772321187
  end pool-1-thread-2 1480772321188
Process finished with exit code 1
 */