package com.company;

public enum Status {
    NONE,
    BORN,
    LIVE,
    DEAD;

    public Status step1(int around) {
        switch (this) {
            case NONE:
                return (around == 3) ? BORN : NONE;
            case LIVE:
                return (around <= 1 || around >= 4) ? DEAD : LIVE;
            default:
                return this;
        }
    }

    public Status step2() {
        switch (this) {

            case BORN:
                return LIVE;
            case DEAD:
                return NONE;
            default:
                return this;
        }
    }

    public boolean isCell() {
        return this == LIVE || this == DEAD;
    }
}
