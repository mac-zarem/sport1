package org.mz;

public class CheckCode {
    public static void main(String[] args) {
        ScoreBoard sc1 = new ScoreBoard();
        sc1.startNewGame("Mexico", "Canada");
        sc1.startNewGame("Spain","Brazil");
        sc1.startNewGame("Germany", "France");
        sc1.startNewGame("Uruguay","Italy");
        sc1.startNewGame("Argentina","Australia");
        sc1.startNewGame("Poland", "Hungary");

        sc1.printSummary();
    }
}