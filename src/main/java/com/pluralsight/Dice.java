package com.pluralsight;

import java.util.Random;

public class Dice {
    int random;

    public Dice(){
        random = 0;
    }
    public int roll() {
        int roll = 1 + (int) (Math.random() * 6);
        return roll;
    }
    }
