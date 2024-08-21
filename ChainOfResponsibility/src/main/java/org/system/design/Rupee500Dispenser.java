package org.system.design;

public class Rupee500Dispenser implements AmountDispenser {
    private AmountDispenser nextDispenser;

    @Override
    public void setNextDispenser(AmountDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispenseAmount(Long amount) {
        if (amount >= 500.0) {
            long numOfNotes = amount / 500;
            long reminder = amount % 500;
            System.out.println("Dispensing " + numOfNotes + " Rs.500 note");
            if (reminder != 0) {
                nextDispenser.dispenseAmount(reminder);
            }
        } else {
            nextDispenser.dispenseAmount(amount);
        }
    }
}
