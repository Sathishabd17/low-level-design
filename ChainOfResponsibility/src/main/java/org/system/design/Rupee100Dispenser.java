package org.system.design;

public class Rupee100Dispenser implements AmountDispenser {

    private AmountDispenser nextDispenser;

    @Override
    public void setNextDispenser(AmountDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispenseAmount(Long amount) {
        if (amount >= 100.0) {
            long numOfNotes = amount / 100;
            long reminder = amount % 100;
            System.out.println("Dispensing " + numOfNotes + " Rs.100 note");
            if (reminder != 0) {
                nextDispenser.dispenseAmount(reminder);
            }
        } else {
            nextDispenser.dispenseAmount(amount);
        }
    }
}
