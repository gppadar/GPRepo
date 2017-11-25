package com.gp;

/**
 * Created by ganesh on 25/11/17.
 */
public class EvenOdd {
    int i = 0;
    int SIZE;

    public EvenOdd(int SIZE) {
        this.SIZE = SIZE;
    }

    public static void main(String args[]) {
        EvenOdd evenOdd = new EvenOdd(10);
        new Thread(new EvenThread(evenOdd)).start();
        new Thread(new OddThread(evenOdd)).start();
    }
}

class EvenThread implements Runnable {
    EvenOdd eo;

    public EvenThread(EvenOdd eo) {
        this.eo = eo;
    }

    @Override
    public void run() {
        for (int i = 0; i < eo.SIZE; i++) {
            synchronized (eo) {
                if (i % 2 == 0) {
                    System.out.println("Even Thread:" + i);
                } else {
                    //System.out.println("Even thread else");
                }
                eo.notifyAll();
                try {
                    eo.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //eo.notify();
            }
        }
    }
}

class OddThread implements Runnable {
    EvenOdd eo;

    public OddThread(EvenOdd eo) {
        this.eo = eo;
    }

    @Override
    public void run() {
        for (int i = 0; i < eo.SIZE; i++) {
            synchronized (eo) {

                if (i % 2 != 0) {
                    System.out.println("Odd Thread:" + i);
                } else {
                    //System.out.println("Odd Thread else");
                }
                eo.notifyAll();
                try {
                    eo.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //eo.notify();
            }
        }
    }
}
