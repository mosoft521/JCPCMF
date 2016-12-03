package com.gmail.mosoft521.jcpcmf.ch03Phaser.p044Phaser_test6_1.test;

import java.util.concurrent.Phaser;

public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("到达了未通过！phase=" + phase
                        + " registeredParties=" + registeredParties);
                return super.onAdvance(phase, registeredParties);
            }

            ;
        };
        System.out.println("A1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());

        System.out.println("A2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        // //////////////

        System.out.println("B1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());

        System.out.println("B2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        // //////////////
        System.out.println("C1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("C1 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        System.out.println("C2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("C2 getPhase=" + phaser.getPhase()
                + " getRegisteredParties=" + phaser.getRegisteredParties()
                + " getArrivedParties=" + phaser.getArrivedParties());
        // //////////////
    }
}
/*
A1 getPhase=0 getRegisteredParties=2 getArrivedParties=0
A1 getPhase=0 getRegisteredParties=2 getArrivedParties=1
A2 getPhase=0 getRegisteredParties=2 getArrivedParties=1
到达了未通过！phase=0 registeredParties=2
A2 getPhase=1 getRegisteredParties=2 getArrivedParties=0
B1 getPhase=1 getRegisteredParties=2 getArrivedParties=0
B1 getPhase=1 getRegisteredParties=2 getArrivedParties=1
B2 getPhase=1 getRegisteredParties=2 getArrivedParties=1
到达了未通过！phase=1 registeredParties=2
B2 getPhase=2 getRegisteredParties=2 getArrivedParties=0
C1 getPhase=2 getRegisteredParties=2 getArrivedParties=0
C1 getPhase=2 getRegisteredParties=2 getArrivedParties=1
C2 getPhase=2 getRegisteredParties=2 getArrivedParties=1
到达了未通过！phase=2 registeredParties=2
C2 getPhase=3 getRegisteredParties=2 getArrivedParties=0
 */