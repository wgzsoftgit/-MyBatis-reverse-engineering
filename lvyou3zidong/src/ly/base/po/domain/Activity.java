package ly.base.po.domain;

public class Activity {
    private Integer actId;

    private String actTime;

    private String actContent;

    private Integer actIspush;

    private Integer actCount;

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getActTime() {
        return actTime;
    }

    public void setActTime(String actTime) {
        this.actTime = actTime == null ? null : actTime.trim();
    }

    public String getActContent() {
        return actContent;
    }

    public void setActContent(String actContent) {
        this.actContent = actContent == null ? null : actContent.trim();
    }

    public Integer getActIspush() {
        return actIspush;
    }

    public void setActIspush(Integer actIspush) {
        this.actIspush = actIspush;
    }

    public Integer getActCount() {
        return actCount;
    }

    public void setActCount(Integer actCount) {
        this.actCount = actCount;
    }
}