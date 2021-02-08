package com.shredder.experiment1;

public abstract class HackerThread extends Thread {

    protected Vault vault;

    public HackerThread(Vault vault){
        this.vault = vault;
        this.setName(this.getClass().getSimpleName());
    }


    @Override
    public synchronized void start() {
        System.out.println("started thread -> " + this.getName());
        super.start();
    }
}
