package com.oreilly.json;

import com.google.gson.annotations.SerializedName;

public class Linescore {

    @SerializedName("home_team_runs")
    private String homeTeamRuns;

    @SerializedName("away_team_runs")
    private String awayTeamRuns;

    public String getHomeTeamRuns() {
        return homeTeamRuns;
    }

    public void setHomeTeamRuns(String homeTeamRuns) {
        this.homeTeamRuns = homeTeamRuns;
    }

    public String getAwayTeamRuns() {
        return awayTeamRuns;
    }

    public void setAwayTeamRuns(String awayTeamRuns) {
        this.awayTeamRuns = awayTeamRuns;
    }
}
