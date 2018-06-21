package service.serviceImpl;

import dao.UserMapper;
import dao.manual.ExtUserMapper;
import entity.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserLoginService;

import java.util.Date;

/**
 * @Author: Lijie
 * @Date: 2018/6/19 16:44
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserLoginServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ExtUserMapper extUserMapper;

    /**
     * 实现用户注册服务接口
     * @param user
     * @return
     */
    @Override
    public String userRegister(User user) {
        String salt = extUserMapper.selectUserSaltByUserNameAndCheckUserName(user.getUserName());
        if(salt != null || salt != " ")
            return "用户名已经存在";
        //加密盐
        user.setUserSalt(DigestUtils.md5Hex(user.getUserName() + new Date().getTime()));
        LOGGER.debug("userSalt:" + user.getUserSalt());
        //加密用户密码
        user.setUserPassword(DigestUtils.sha1Hex(user.getUserPassword() + user.getUserSalt()));
        LOGGER.debug("userPassword:" + user.getUserPassword());
        if (userMapper.insert(user) >= 1)
            return "注册成功";
        return "注册失败";
    }

    /**
     * 实现用户登录服务接口
     * @param user
     * @return
     */
    @Override
    public boolean userLogin(User user) {
        String salt = extUserMapper.selectUserSaltByUserNameAndCheckUserName(user.getUserName());
        if(salt != null || salt != " ")
            return false;
        user.setUserPassword(DigestUtils.sha1Hex(user.getUserPassword() + user.getUserSalt()));
        String login = extUserMapper.userLoginByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
        if(login != null && login != " ")
            return true;
        return false;
    }
}
