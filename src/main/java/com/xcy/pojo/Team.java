package com.xcy.pojo;

public class Team {
    private int id;
    private String name;
    private String detail;
    private int win;
    private int lose;
    private int hot;
    private int type;
    private String country;

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", win=" + win +
                ", lose=" + lose +
                ", hot=" + hot +
                ", type=" + type +
                ", country='" + country + '\'' +
                '}';
    }

    public Team(int id, String name, String detail, int win, int lose, int hot, int type, String country) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.win = win;
        this.lose = lose;
        this.hot = hot;
        this.type = type;
        this.country = country;
    }
    public Team(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
