package entity;

import java.io.Serializable;
import java.util.Date;

public class Merchandise implements Serializable {
    private Long id;

    private String merchandiseCode;

    private String merchandiseName;

    private String merchandiseContent;

    private Double merchandisePrice;

    private Integer merchandiseNumber;

    private String merchandiseFactory;

    private Date merchandiseBirthday;

    private Integer merchandiseCategoryId;

    private Long merchandiseShopId;

    private Date gmtCreate;

    private Date gmtUpdate;

    private Byte isDelete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMerchandiseCode() {
        return merchandiseCode;
    }

    public void setMerchandiseCode(String merchandiseCode) {
        this.merchandiseCode = merchandiseCode == null ? null : merchandiseCode.trim();
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName == null ? null : merchandiseName.trim();
    }

    public String getMerchandiseContent() {
        return merchandiseContent;
    }

    public void setMerchandiseContent(String merchandiseContent) {
        this.merchandiseContent = merchandiseContent == null ? null : merchandiseContent.trim();
    }

    public Double getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandisePrice(Double merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    }

    public Integer getMerchandiseNumber() {
        return merchandiseNumber;
    }

    public void setMerchandiseNumber(Integer merchandiseNumber) {
        this.merchandiseNumber = merchandiseNumber;
    }

    public String getMerchandiseFactory() {
        return merchandiseFactory;
    }

    public void setMerchandiseFactory(String merchandiseFactory) {
        this.merchandiseFactory = merchandiseFactory == null ? null : merchandiseFactory.trim();
    }

    public Date getMerchandiseBirthday() {
        return merchandiseBirthday;
    }

    public void setMerchandiseBirthday(Date merchandiseBirthday) {
        this.merchandiseBirthday = merchandiseBirthday;
    }

    public Integer getMerchandiseCategoryId() {
        return merchandiseCategoryId;
    }

    public void setMerchandiseCategoryId(Integer merchandiseCategoryId) {
        this.merchandiseCategoryId = merchandiseCategoryId;
    }

    public Long getMerchandiseShopId() {
        return merchandiseShopId;
    }

    public void setMerchandiseShopId(Long merchandiseShopId) {
        this.merchandiseShopId = merchandiseShopId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", merchandiseCode=").append(merchandiseCode);
        sb.append(", merchandiseName=").append(merchandiseName);
        sb.append(", merchandiseContent=").append(merchandiseContent);
        sb.append(", merchandisePrice=").append(merchandisePrice);
        sb.append(", merchandiseNumber=").append(merchandiseNumber);
        sb.append(", merchandiseFactory=").append(merchandiseFactory);
        sb.append(", merchandiseBirthday=").append(merchandiseBirthday);
        sb.append(", merchandiseCategoryId=").append(merchandiseCategoryId);
        sb.append(", merchandiseShopId=").append(merchandiseShopId);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", isDelete=").append(isDelete);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Merchandise other = (Merchandise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchandiseCode() == null ? other.getMerchandiseCode() == null : this.getMerchandiseCode().equals(other.getMerchandiseCode()))
            && (this.getMerchandiseName() == null ? other.getMerchandiseName() == null : this.getMerchandiseName().equals(other.getMerchandiseName()))
            && (this.getMerchandiseContent() == null ? other.getMerchandiseContent() == null : this.getMerchandiseContent().equals(other.getMerchandiseContent()))
            && (this.getMerchandisePrice() == null ? other.getMerchandisePrice() == null : this.getMerchandisePrice().equals(other.getMerchandisePrice()))
            && (this.getMerchandiseNumber() == null ? other.getMerchandiseNumber() == null : this.getMerchandiseNumber().equals(other.getMerchandiseNumber()))
            && (this.getMerchandiseFactory() == null ? other.getMerchandiseFactory() == null : this.getMerchandiseFactory().equals(other.getMerchandiseFactory()))
            && (this.getMerchandiseBirthday() == null ? other.getMerchandiseBirthday() == null : this.getMerchandiseBirthday().equals(other.getMerchandiseBirthday()))
            && (this.getMerchandiseCategoryId() == null ? other.getMerchandiseCategoryId() == null : this.getMerchandiseCategoryId().equals(other.getMerchandiseCategoryId()))
            && (this.getMerchandiseShopId() == null ? other.getMerchandiseShopId() == null : this.getMerchandiseShopId().equals(other.getMerchandiseShopId()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtUpdate() == null ? other.getGmtUpdate() == null : this.getGmtUpdate().equals(other.getGmtUpdate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchandiseCode() == null) ? 0 : getMerchandiseCode().hashCode());
        result = prime * result + ((getMerchandiseName() == null) ? 0 : getMerchandiseName().hashCode());
        result = prime * result + ((getMerchandiseContent() == null) ? 0 : getMerchandiseContent().hashCode());
        result = prime * result + ((getMerchandisePrice() == null) ? 0 : getMerchandisePrice().hashCode());
        result = prime * result + ((getMerchandiseNumber() == null) ? 0 : getMerchandiseNumber().hashCode());
        result = prime * result + ((getMerchandiseFactory() == null) ? 0 : getMerchandiseFactory().hashCode());
        result = prime * result + ((getMerchandiseBirthday() == null) ? 0 : getMerchandiseBirthday().hashCode());
        result = prime * result + ((getMerchandiseCategoryId() == null) ? 0 : getMerchandiseCategoryId().hashCode());
        result = prime * result + ((getMerchandiseShopId() == null) ? 0 : getMerchandiseShopId().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtUpdate() == null) ? 0 : getGmtUpdate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}