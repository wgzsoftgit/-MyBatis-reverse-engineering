package ly.base.po.domain;

public class Video {
    private Integer vidId;

    private String vidName;

    private String vidLive;

    private Integer vidIspush;

    private Integer vidCount;

    public Integer getVidId() {
        return vidId;
    }

    public void setVidId(Integer vidId) {
        this.vidId = vidId;
    }

    public String getVidName() {
        return vidName;
    }

    public void setVidName(String vidName) {
        this.vidName = vidName == null ? null : vidName.trim();
    }

    public String getVidLive() {
        return vidLive;
    }

    public void setVidLive(String vidLive) {
        this.vidLive = vidLive == null ? null : vidLive.trim();
    }

    public Integer getVidIspush() {
        return vidIspush;
    }

    public void setVidIspush(Integer vidIspush) {
        this.vidIspush = vidIspush;
    }

    public Integer getVidCount() {
        return vidCount;
    }

    public void setVidCount(Integer vidCount) {
        this.vidCount = vidCount;
    }
}