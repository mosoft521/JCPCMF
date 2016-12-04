package com.gmail.mosoft521.jcpcmf.ch10.p158PriorityBlockingQueue.entity;

public class Userinfo implements Comparable<Userinfo> {

    private int id;

    public Userinfo() {
        super();
    }

    public Userinfo(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Userinfo o) {
        if (this.id < o.getId()) {
            return -1;
        }
        if (this.id > o.getId()) {
            return 1;
        }
        return 0;
    }

}
