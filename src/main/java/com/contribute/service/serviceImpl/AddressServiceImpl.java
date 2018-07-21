package com.contribute.service.serviceImpl;

import com.contribute.entity.Address;
import com.contribute.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Author: Lijie
 * @Date: 2018/7/11 15:30
 */
@Service
public class AddressServiceImpl implements AddressService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * 增加地址
     *
     * @param address        地址
     * @param userShopOrName 用户名
     * @return
     */
    @Override
    public String addAddress(Address address, String userShopOrName) {
        return null;
    }

    /**
     * 删除地址
     *
     * @param address        地址
     * @param userShopOrName 用户名
     * @return
     */
    @Override
    public String deleteAddress(Address address, String userShopOrName) {
        return null;
    }

    /**
     * 查询地址
     *
     * @param userShopOrName 用户名
     * @return
     */
    @Override
    public Address queryAddress(String userShopOrName) {
        return null;
    }
}
