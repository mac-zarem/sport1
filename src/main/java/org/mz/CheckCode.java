package org.mz;

import java.util.Collections;

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

        sc1.updateScore(0,5, 0);
        sc1.updateScore(10,2, 1);
        sc1.updateScore(2,2, 2);
        sc1.updateScore(6,6, 3);
        sc1.updateScore(3,1, 4);
        sc1.updateScore(3,2, 5);

        Collections.sort(sc1.games);

        sc1.printSummary();

        sc1.finishGame(2);

        sc1.printSummary();
    }
}