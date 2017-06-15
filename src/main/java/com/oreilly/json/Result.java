package com.oreilly.json;

public class Result {
    private String subject;
    private String copyright;
    private Data data;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Boxscore boxscore = data.getBoxscore();
        String awayFname = boxscore.getAwayFname();
        String homeFname = boxscore.getHomeFname();
        String awayTeamRuns = boxscore.getLinescore().getAwayTeamRuns();
        String homeTeamRuns = boxscore.getLinescore().getHomeTeamRuns();
        String date = boxscore.getDate();
        return String.format("%s: %s %s, %s %s", date, awayFname, awayTeamRuns, homeFname, homeTeamRuns);
    }
}
