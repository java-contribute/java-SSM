package entity;

import java.io.Serializable;
import java.util.Date;

public class ShoppingCartMerchandise implements Serializable {
    private Long id;

    private Long shoppingCartId;

    private Long merchandiseId;

    private Integer merchandiseNumber;

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

    public Long getShoppingCartId() {
        return shoppingCartId;
    }

    public void setShoppingCartId(Long shoppingCartId) {
        this.shoppingCartId = shoppingCartId;
    }

    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getMerchandiseNumber() {
        return merchandiseNumber;
    }

    public void setMerchandiseNumber(Integer merchandiseNumber) {
        this.merchandiseNumber = merchandiseNumber;
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
        sb.append(", shoppingCartId=").append(shoppingCartId);
        sb.append(", merchandiseId=").append(merchandiseId);
        sb.append(", merchandiseNumber=").append(merchandiseNumber);
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
        ShoppingCartMerchandise other = (ShoppingCartMerchandise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShoppingCartId() == null ? other.getShoppingCartId() == null : this.getShoppingCartId().equals(other.getShoppingCartId()))
            && (this.getMerchandiseId() == null ? other.getMerchandiseId() == null : this.getMerchandiseId().equals(other.getMerchandiseId()))
            && (this.getMerchandiseNumber() == null ? other.getMerchandiseNumber() == null : this.getMerchandiseNumber().equals(other.getMerchandiseNumber()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtUpdate() == null ? other.getGmtUpdate() == null : this.getGmtUpdate().equals(other.getGmtUpdate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShoppingCartId() == null) ? 0 : getShoppingCartId().hashCode());
        result = prime * result + ((getMerchandiseId() == null) ? 0 : getMerchandiseId().hashCode());
        result = prime * result + ((getMerchandiseNumber() == null) ? 0 : getMerchandiseNumber().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtUpdate() == null) ? 0 : getGmtUpdate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}