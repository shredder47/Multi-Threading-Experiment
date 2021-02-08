package com.shredder.experiment1;

public class PoliceThread extends Thread{

    @Override
    public void run() {
        for (int i = 10; i >0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println("Police Arriving IN " + i +" secs");
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Police Arrived");
        System.exit(0);
    }
}
