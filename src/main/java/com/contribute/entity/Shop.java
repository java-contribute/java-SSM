package entity;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable {
    private Long id;

    private String shopIdentity;

    private String shopPassword;

    private String shopSalt;

    private String shopName;

    private String shopNumber;

    private String shopEmail;

    private Long shopCategory;

    private Byte shopState;

    private Date gmtUpdate;

    private Date gmtCreate;

    private Byte isDelete;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopIdentity() {
        return shopIdentity;
    }

    public void setShopIdentity(String shopIdentity) {
        this.shopIdentity = shopIdentity == null ? null : shopIdentity.trim();
    }

    public String getShopPassword() {
        return shopPassword;
    }

    public void setShopPassword(String shopPassword) {
        this.shopPassword = shopPassword == null ? null : shopPassword.trim();
    }

    public String getShopSalt() {
        return shopSalt;
    }

    public void setShopSalt(String shopSalt) {
        this.shopSalt = shopSalt == null ? null : shopSalt.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber == null ? null : shopNumber.trim();
    }

    public String getShopEmail() {
        return shopEmail;
    }

    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail == null ? null : shopEmail.trim();
    }

    public Long getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(Long shopCategory) {
        this.shopCategory = shopCategory;
    }

    public Byte getShopState() {
        return shopState;
    }

    public void setShopState(Byte shopState) {
        this.shopState = shopState;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
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
        sb.append(", shopIdentity=").append(shopIdentity);
        sb.append(", shopPassword=").append(shopPassword);
        sb.append(", shopSalt=").append(shopSalt);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopNumber=").append(shopNumber);
        sb.append(", shopEmail=").append(shopEmail);
        sb.append(", shopCategory=").append(shopCategory);
        sb.append(", shopState=").append(shopState);
        sb.append(", gmtUpdate=").append(gmtUpdate);
        sb.append(", gmtCreate=").append(gmtCreate);
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
        Shop other = (Shop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShopIdentity() == null ? other.getShopIdentity() == null : this.getShopIdentity().equals(other.getShopIdentity()))
            && (this.getShopPassword() == null ? other.getShopPassword() == null : this.getShopPassword().equals(other.getShopPassword()))
            && (this.getShopSalt() == null ? other.getShopSalt() == null : this.getShopSalt().equals(other.getShopSalt()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()))
            && (this.getShopNumber() == null ? other.getShopNumber() == null : this.getShopNumber().equals(other.getShopNumber()))
            && (this.getShopEmail() == null ? other.getShopEmail() == null : this.getShopEmail().equals(other.getShopEmail()))
            && (this.getShopCategory() == null ? other.getShopCategory() == null : this.getShopCategory().equals(other.getShopCategory()))
            && (this.getShopState() == null ? other.getShopState() == null : this.getShopState().equals(other.getShopState()))
            && (this.getGmtUpdate() == null ? other.getGmtUpdate() == null : this.getGmtUpdate().equals(other.getGmtUpdate()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShopIdentity() == null) ? 0 : getShopIdentity().hashCode());
        result = prime * result + ((getShopPassword() == null) ? 0 : getShopPassword().hashCode());
        result = prime * result + ((getShopSalt() == null) ? 0 : getShopSalt().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        result = prime * result + ((getShopNumber() == null) ? 0 : getShopNumber().hashCode());
        result = prime * result + ((getShopEmail() == null) ? 0 : getShopEmail().hashCode());
        result = prime * result + ((getShopCategory() == null) ? 0 : getShopCategory().hashCode());
        result = prime * result + ((getShopState() == null) ? 0 : getShopState().hashCode());
        result = prime * result + ((getGmtUpdate() == null) ? 0 : getGmtUpdate().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}