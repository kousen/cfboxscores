package com.oreilly.json;

import com.google.gson.annotations.SerializedName;

public class Boxscore {

    @SerializedName("home_sname")
    private String homeSname;

    @SerializedName("away_sname")
    private String awaySname;

    @SerializedName("home_fname")
    private String homeFname;

    @SerializedName("away_fname")
    private String awayFname;

    private String date;

    private Linescore linescore;

    public String getHomeSname() {
        return homeSname;
    }

    public void setHomeSname(String homeSname) {
        this.homeSname = homeSname;
    }

    public String getAwaySname() {
        return awaySname;
    }

    public void setAwaySname(String awaySname) {
        this.awaySname = awaySname;
    }

    public String getHomeFname() {
        return homeFname;
    }

    public void setHomeFname(String homeFname) {
        this.homeFname = homeFname;
    }

    public String getAwayFname() {
        return awayFname;
    }

    public void setAwayFname(String awayFname) {
        this.awayFname = awayFname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Linescore getLinescore() {
        return linescore;
    }

    public void setLinescore(Linescore linescore) {
        this.linescore = linescore;
    }
}
