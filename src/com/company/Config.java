package com.company;

import java.awt.*;

public class Config {

    public static final int SIZE = 5;
    public static final int WIDTH = 80;
    public static final int HEIGHT = 40;
    public static final int SLEEPMS = 100;

    public static Color getColor(Status status) {
        switch (status) {
            default:
            case NONE:
                return Color.GREEN;
            case LIVE:
                return Color.WHITE;
            case BORN:
                return Color.RED;
            case DEAD:
                return Color.BLACK;

        }
    }
}
