package com.xcy.pojo;

public class Player {

    private int id;
    private String name;
    private int age;
    private String sex;
    private String detail;
    private int type;
    private int hot;
    private int teamId;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public Player(){}

    public Player(int id, String name, int age, String sex, String detail, int type, int hot, int teamId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.detail = detail;
        this.type = type;
        this.hot = hot;
        this.teamId = teamId;
    }


    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", detail='" + detail + '\'' +
                ", type=" + type +
                ", hot=" + hot +
                ", teamId=" + teamId +
                '}';
    }
}
