package com.gmail.mosoft521.jcpcmf.ch10.p151ConcurrentSkipListMap.test1;

public class Userinfo implements Comparable<Userinfo> {

    private int id;
    private String username;

    public Userinfo() {
        super();
    }

    public Userinfo(int id, String username) {
        super();
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(Userinfo u) {
        if (this.getId() < u.getId()) {
            return -1;
        }
        if (this.getId() > u.getId()) {
            return 1;
        }
        return 0;
    }

}
