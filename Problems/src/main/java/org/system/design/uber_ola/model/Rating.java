package org.system.design.uber_ola.model;

public enum Rating {

    UNASSIGNED(0),
    ONE_STAR(1),
    TWO_STARS(2),
    THREE_STARS(3),
    FOUR_STARS(4),
    FIVE_STARS(5);

    private final int value;

    Rating(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
