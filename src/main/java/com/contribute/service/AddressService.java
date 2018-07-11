package com.contribute.service;

import com.contribute.entity.Address;

/**
 * @Author: Lijie
 * @Date: 2018/7/11 15:25
 */
public interface AddressService {
    /**
     * 增加地址
     * @param address 地址
     * @param userShopOrName 用户名
     * @return
     */
    String addAddress(Address address,String userShopOrName);

    /**
     * 删除地址
     * @param address 地址
     * @param userShopOrName 用户名
     * @return
     */
    String deleteAddress(Address address,String userShopOrName);

    /**
     * 查询地址
     * @param userShopOrName 用户名
     * @return
     */
    Address queryAddress(String userShopOrName);
}
