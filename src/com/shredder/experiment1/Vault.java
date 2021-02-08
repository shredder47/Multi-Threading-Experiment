package com.shredder.experiment1;

public class Vault {

    private int password;
    public static final int MAX_PASS = 10000;

    public Vault(int password) {
        this.password = password;
    }

    public boolean isCorrectPassword(int guess) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException ignored) {
        }
        return this.password == guess;
    }
}
