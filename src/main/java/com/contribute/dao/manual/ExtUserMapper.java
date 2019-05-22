package com.contribute.dao.manual;

import com.contribute.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 15:59
 */
public interface ExtUserMapper {
    /**
     * 检查用户存在和获取用户密码盐
     * @param userName
     * @return
     */
    String selectUserSaltByUserNameAndCheckUserName(@Param("userName") String userName);

    /**
     * 用户登录
     * @param userName
     * @param userPassword
     * @return
     */
    String userLoginByUserNameAndUserPassword(@Param("userName") String userName,
                                              @Param("userPassword") String userPassword);

    /**
     * 查看用户详情
     * @param userName
     * @return
     */
    User userDetail(@Param("userName") String userName);

    /**
     * 删除用户
     * @param userName
     * @return
     */
    int userDelete(@Param("userName") String userName);
}
