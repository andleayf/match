package com.xcy.pojo;

//import org.springframework.data.elasticsearch.annotations.Document;

//@Document(indexName = "match")
public class Match {
    private int id;
    private String title;
    private String detail;
    private String url;
    private String detailsId;

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", url='" + url + '\'' +
                ", detailsId='" + detailsId + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(String detailsId) {
        this.detailsId = detailsId;
    }

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

    public Match(int id, String title, String detail) {
        this.id = id;
        this.title = title;
        this.detail = detail;
    }
    public Match() {
    }


}
