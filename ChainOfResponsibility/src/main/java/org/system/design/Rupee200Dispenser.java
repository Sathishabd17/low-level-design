package org.system.design;

public class Rupee200Dispenser implements AmountDispenser {
    private AmountDispenser nextDispenser;

    @Override
    public void setNextDispenser(AmountDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispenseAmount(Long amount) {
        if (amount >= 200.0) {
            long numOfNotes = amount / 200;
            long reminder = amount % 200;
            System.out.println("Dispensing " + numOfNotes + " Rs.200 note");
            if (reminder != 0) {
                nextDispenser.dispenseAmount(reminder);
            }
        } else {
            nextDispenser.dispenseAmount(amount);
        }
    }
}
