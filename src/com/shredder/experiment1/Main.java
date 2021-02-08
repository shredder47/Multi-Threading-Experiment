package com.shredder.experiment1;

import java.util.Random;


//Two hacker is trying to crack a same Vault simultaneously
// Police will arrive in 10 seconds
public class Main {

    public static void main(String[] args) {

        Vault vault = new Vault(new Random().nextInt(Vault.MAX_PASS));

        HackerThread ascendingHacker = new AscendingHacker(vault);
        HackerThread descendingHacker = new DescendingHacker(vault);
        Thread police = new PoliceThread();

        ascendingHacker.start();
        descendingHacker.start();
        police.start();
    }
}
