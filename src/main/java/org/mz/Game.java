package org.mz;

public class Game {

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(int awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public String getScore() {
        return this.getHomeTeamGoals() + ":" + this.getAwayTeamGoals();
    }

    private String homeTeamName;
    private String awayTeamName;
    private int homeTeamGoals;
    private int awayTeamGoals;

    Game(String name1, String name2){
        this.setHomeTeamName(name1);
        this.setAwayTeamName(name2);
        this.setHomeTeamGoals(0);
        this.setAwayTeamGoals(0);

    }

    public void updateScore(int homeGoals, int awayGoals){
        this.setHomeTeamGoals(homeGoals);
        this.setAwayTeamGoals(awayGoals);
    }
}
