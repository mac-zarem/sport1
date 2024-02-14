package org.mz;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard {

    List<Game> games = new ArrayList<>();

    public void startNewGame(String homeT, String awayT){
        Game g1 = new Game(homeT,awayT);
        games.add(g1);
        System.out.println("New game started.");
    }

    public void updateScore(int homeGoals, int awayGoals, int gameId){
        games.get(gameId).updateScore(homeGoals,awayGoals);
        System.out.println("Game score updated.");
    }

    public void finishGame(int gameId){
        games.remove(gameId);
        System.out.println("Game finished.");
    }

    public void printSummary(){
        int counter = 1;
        for(Game g : games){
            if(g != null){
                System.out.println(counter + "." + g.getHomeTeamName() + " " + g.getHomeTeamGoals() +
                        " - " + g.getAwayTeamName() + " " + g.getAwayTeamGoals());
                counter++;
            }
        }
    }

}
