package org.system.design;

public interface AmountDispenser {

    void setNextDispenser(AmountDispenser nextDispenser);

    void dispenseAmount(Long amount);
}
