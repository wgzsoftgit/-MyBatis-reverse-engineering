package ly.base.po.domain;

public class Scenic {
    private Integer sceId;

    private String sceName;

    private String scePicture;

    private String sceContent;

    private Float scePrice;

    private Float sceVprice;

    private Integer sceCount;

    private Integer sceIspush;

    public Integer getSceId() {
        return sceId;
    }

    public void setSceId(Integer sceId) {
        this.sceId = sceId;
    }

    public String getSceName() {
        return sceName;
    }

    public void setSceName(String sceName) {
        this.sceName = sceName == null ? null : sceName.trim();
    }

    public String getScePicture() {
        return scePicture;
    }

    public void setScePicture(String scePicture) {
        this.scePicture = scePicture == null ? null : scePicture.trim();
    }

    public String getSceContent() {
        return sceContent;
    }

    public void setSceContent(String sceContent) {
        this.sceContent = sceContent == null ? null : sceContent.trim();
    }

    public Float getScePrice() {
        return scePrice;
    }

    public void setScePrice(Float scePrice) {
        this.scePrice = scePrice;
    }

    public Float getSceVprice() {
        return sceVprice;
    }

    public void setSceVprice(Float sceVprice) {
        this.sceVprice = sceVprice;
    }

    public Integer getSceCount() {
        return sceCount;
    }

    public void setSceCount(Integer sceCount) {
        this.sceCount = sceCount;
    }

    public Integer getSceIspush() {
        return sceIspush;
    }

    public void setSceIspush(Integer sceIspush) {
        this.sceIspush = sceIspush;
    }
}