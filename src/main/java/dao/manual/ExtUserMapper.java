package dao.manual;

import entity.User;
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
}
