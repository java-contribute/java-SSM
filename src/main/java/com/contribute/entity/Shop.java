package com.contribute.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table <tt>shop</tt>
 * 
 * This file is generated by <tt>dwframe<tt>
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to find the file
 * <tt>{project-home}/dalgen/mybatis_generator.xml<tt>. Modify the configuration file
 * according to your needs, then run <tt>ant</tt> to generate this file in {project-home}/dalgen.
 * 
 * @author dwframe
 * @since 2018-07-16
 */
public class Shop implements Serializable {
    /**
     * <pre>
     * 自增id
     * This field corresponds to the database column <tt>shop.id<tt>
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 商户账号
     * This field corresponds to the database column <tt>shop.shop_identity<tt>
     * </pre>
     */
    private String shopIdentity;

    /**
     * <pre>
     * 商户密码
     * This field corresponds to the database column <tt>shop.shop_password<tt>
     * </pre>
     */
    private String shopPassword;

    /**
     * <pre>
     * 加密盐
     * This field corresponds to the database column <tt>shop.shop_salt<tt>
     * </pre>
     */
    private String shopSalt;

    /**
     * <pre>
     * 商店名称
     * This field corresponds to the database column <tt>shop.shop_name<tt>
     * </pre>
     */
    private String shopName;

    /**
     * <pre>
     * 商店联系方式
     * This field corresponds to the database column <tt>shop.shop_number<tt>
     * </pre>
     */
    private String shopNumber;

    /**
     * <pre>
     * 商家邮箱
     * This field corresponds to the database column <tt>shop.shop_email<tt>
     * </pre>
     */
    private String shopEmail;

    /**
     * <pre>
     * 商店类别
     * This field corresponds to the database column <tt>shop.shop_category<tt>
     * </pre>
     */
    private Long shopCategory;

    /**
     * <pre>
     * 0-正在营业,1-暂停营业
     * This field corresponds to the database column <tt>shop.shop_state<tt>
     * </pre>
     */
    private Integer shopState;

    /**
     * <pre>
     * 最后一次修改时间
     * This field corresponds to the database column <tt>shop.gmt_update<tt>
     * </pre>
     */
    private Date gmtUpdate;

    /**
     * <pre>
     * 添加时间
     * This field corresponds to the database column <tt>shop.gmt_create<tt>
     * </pre>
     */
    private Date gmtCreate;

    /**
     * <pre>
     * 逻辑删除,0-未删除,1-删除,默认为0
     * This field corresponds to the database column <tt>shop.is_delete<tt>
     * </pre>
     */
    private Integer isDelete;

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.id<tt>
     * </pre>
     *
     * @return 自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.id<tt>
     * </pre>
     *
     * @param id 自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_identity<tt>
     * </pre>
     *
     * @return 商户账号
     */
    public String getShopIdentity() {
        return shopIdentity;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_identity<tt>
     * </pre>
     *
     * @param shopIdentity 商户账号
     */
    public void setShopIdentity(String shopIdentity) {
        this.shopIdentity = shopIdentity == null ? null : shopIdentity.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_password<tt>
     * </pre>
     *
     * @return 商户密码
     */
    public String getShopPassword() {
        return shopPassword;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_password<tt>
     * </pre>
     *
     * @param shopPassword 商户密码
     */
    public void setShopPassword(String shopPassword) {
        this.shopPassword = shopPassword == null ? null : shopPassword.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_salt<tt>
     * </pre>
     *
     * @return 加密盐
     */
    public String getShopSalt() {
        return shopSalt;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_salt<tt>
     * </pre>
     *
     * @param shopSalt 加密盐
     */
    public void setShopSalt(String shopSalt) {
        this.shopSalt = shopSalt == null ? null : shopSalt.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_name<tt>
     * </pre>
     *
     * @return 商店名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_name<tt>
     * </pre>
     *
     * @param shopName 商店名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_number<tt>
     * </pre>
     *
     * @return 商店联系方式
     */
    public String getShopNumber() {
        return shopNumber;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_number<tt>
     * </pre>
     *
     * @param shopNumber 商店联系方式
     */
    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber == null ? null : shopNumber.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_email<tt>
     * </pre>
     *
     * @return 商家邮箱
     */
    public String getShopEmail() {
        return shopEmail;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_email<tt>
     * </pre>
     *
     * @param shopEmail 商家邮箱
     */
    public void setShopEmail(String shopEmail) {
        this.shopEmail = shopEmail == null ? null : shopEmail.trim();
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_category<tt>
     * </pre>
     *
     * @return 商店类别
     */
    public Long getShopCategory() {
        return shopCategory;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_category<tt>
     * </pre>
     *
     * @param shopCategory 商店类别
     */
    public void setShopCategory(Long shopCategory) {
        this.shopCategory = shopCategory;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_state<tt>
     * </pre>
     *
     * @return 0-正在营业,1-暂停营业
     */
    public Integer getShopState() {
        return shopState;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.shop_state<tt>
     * </pre>
     *
     * @param shopState 0-正在营业,1-暂停营业
     */
    public void setShopState(Integer shopState) {
        this.shopState = shopState;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.gmt_update<tt>
     * </pre>
     *
     * @return 最后一次修改时间
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.gmt_update<tt>
     * </pre>
     *
     * @param gmtUpdate 最后一次修改时间
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.gmt_create<tt>
     * </pre>
     *
     * @return 添加时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.gmt_create<tt>
     * </pre>
     *
     * @param gmtCreate 添加时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.is_delete<tt>
     * </pre>
     *
     * @return 逻辑删除,0-未删除,1-删除,默认为0
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * <pre>
     * This field corresponds to the database column <tt>shop.is_delete<tt>
     * </pre>
     *
     * @param isDelete 逻辑删除,0-未删除,1-删除,默认为0
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     *
     */
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

    /**
     *
     * @param that
     */
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

    /**
     *
     */
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