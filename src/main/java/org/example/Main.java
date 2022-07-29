package org.example;

public class Main {

    public static volatile int number = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }


    static class Thread1 extends Thread {

        @Override
        public void run() {
            while (number < 10) {
                if (number % 2 == 0) {
                    System.out.println("T1 " + number);
                    number++;
                }
            }
        }
    }

    static class Thread2 extends Thread {

        @Override
        public void run() {
            while (number < 10) {
                if (number % 2 != 0) {
                    System.out.println("T2 " + number);
                    number++;
                }
            }
        }
    }

}