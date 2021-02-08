package com.shredder.experiment1;

public class AscendingHacker extends HackerThread{

    public AscendingHacker(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {

        for (int i = Vault.MAX_PASS; i > 0; i--) {
            if(vault.isCorrectPassword(i)){
                System.out.println(this.getName() + " Cracked the Password");
                System.exit(0);
            }
        }
    }
}
