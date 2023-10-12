package com.pluralsight;

public class RollDice {
    public static void main(String[] args) {

        Dice dice = new Dice();
        int roll1;
        int roll2;

        int diceRoll2 = 0;
        int diceRoll4 = 0;
        int diceRoll6 = 0;
        int diceRoll7 = 0;
        int sum;

        for (int i = 1; i <= 100; i++) ;
        {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            if (sum == 2) {
                diceRoll2++;
            } else if (sum == 4) {
                diceRoll4++;
            } else if (sum == 6) {
                diceRoll6++;
            } else if (sum == 7) {
                diceRoll7++;
            }
            System.out.print("Roll " + dice + ": " + roll1 + " - " + roll2 + " Sum: " + sum + "\n");
        }

        System.out.println("Sum of two: " + diceRoll2);
        System.out.println("Sum of four: " + diceRoll4);
        System.out.println("Sum of six: " + diceRoll6);
        System.out.println("Sum of seven: " + diceRoll7);

    }
}
