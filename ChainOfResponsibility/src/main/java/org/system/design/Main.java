package org.system.design;

import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        while (true) {
            long amount = 0L;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextLong();
            if (amount % 100 != 0) {
                System.out.println("Amount should be in multiple of 100s.");
                return;
            }
            // process the request
            getAmountDispenser().dispenseAmount(amount);
        }
    }

    public static AmountDispenser getAmountDispenser() {
        // initialize the chain
        AmountDispenser amountDispenser = new Rupee500Dispenser();
        AmountDispenser c2 = new Rupee200Dispenser();
        AmountDispenser c3 = new Rupee100Dispenser();

        // set the chain of responsibility
        amountDispenser.setNextDispenser(c2);
        c2.setNextDispenser(c3);
        return amountDispenser;
    }
}