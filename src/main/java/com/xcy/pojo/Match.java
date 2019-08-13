package com.xcy.pojo;

//import org.springframework.data.elasticsearch.annotations.Document;
import java.util.Date;
import java.util.List;

public class Match {
    private int id;
    private String title;
    private String detail;
    private Date startTime;
    private Date endTime;
    private int matchType;
    private int redTeamId;
    private int blueTeamId;
    private int hot;
    private String url;
//    private Team readTeam;
//    private Team blueTeam;
    private List<Team> teams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getStartTime() {
        return startTime;
    }


    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    //@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getMatchType() {
        return matchType;
    }

    public void setMatchType(int matchType) {
        this.matchType = matchType;
    }

    public int getRedTeamId() {
        return redTeamId;
    }

    public void setRedTeamId(int redTeamId) {
        this.redTeamId = redTeamId;
    }

    public int getBlueTeamId() {
        return blueTeamId;
    }

    public void setBlueTeamId(int blueTeamId) {
        this.blueTeamId = blueTeamId;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

//    public Team getReadTeam() {
//        return readTeam;
//    }
//
//    public void setReadTeam(Team readTeam) {
//        this.readTeam = readTeam;
//    }
//
//    public Team getBlueTeam() {
//        return blueTeam;
//    }
//
//    public void setBlueTeam(Team blueTeam) {
//        this.blueTeam = blueTeam;
//    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
    public Match(int id, String title, String detail) {
        this.id = id;
        this.title = title;
        this.detail = detail;
    }
    public Match(){

    }
}
