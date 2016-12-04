package com.gmail.mosoft521.jcpcmf.ch10Queue.PriorityQueue.myComparator;

import com.gmail.mosoft521.jcpcmf.ch10Queue.PriorityQueue.entity.Userinfo;

import java.util.Comparator;

public class MyUserinfoComparator implements Comparator<Userinfo> {
    @Override
    public int compare(Userinfo o1, Userinfo o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        }
        if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }
}
