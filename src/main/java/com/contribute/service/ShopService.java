package com.contribute.service;

import com.contribute.entity.Shop;

/**
 * @Author: Lijie
 * @Date: 2018/6/30 18:21
 * 商家服务层
 */
public interface ShopService {

    /**
     * 商户注册
     * @param shop 商户
     * @return
     */
    Shop shopRegister(Shop shop);

    /**
     * 商户登录
     * @param shop 商户
     * @return
     */
    Shop shopLogin(Shop shop);

    /**
     * 查询全部商户
     * @return
     */
    Shop queryAll();

    /**
     * 商户详情
     * @return
     */
    Shop shopDetail(String shopName);
}
