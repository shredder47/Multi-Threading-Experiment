package com.shredder.experiment1;

public class DescendingHacker extends HackerThread{

    public DescendingHacker(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {

        for (int i = 0; i < Vault.MAX_PASS; i++) {
            if(vault.isCorrectPassword(i)){
                System.out.println(this.getName() + " Cracked the Password");
                System.exit(0);
            }
        }
    }
}
