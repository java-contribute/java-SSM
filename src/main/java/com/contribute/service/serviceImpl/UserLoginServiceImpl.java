package com.contribute.service.serviceImpl;

import com.contribute.common.enums.UserLoginEnum;
import com.contribute.common.exceptions.UserLoginException;
import com.contribute.dao.UserMapper;
import com.contribute.dao.manual.ExtUserMapper;
import com.contribute.dto.UserLoginExecution;
import com.contribute.entity.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.contribute.service.UserLoginService;

import java.util.Date;
import java.util.List;

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
    public UserLoginExecution userRegister(User user){
        try {
            String salt = extUserMapper.selectUserSaltByUserNameAndCheckUserName(user.getUserName());
            if(salt != null && salt != " ")
                return new UserLoginExecution(user.getUserName(),UserLoginEnum.REGISTER_ECHO);
            //加密盐
            user.setUserSalt(DigestUtils.md5Hex(user.getUserName() + new Date().getTime()));
            LOGGER.info("userSalt:{}", user.getUserSalt());
            //加密用户密码
            user.setUserPassword(DigestUtils.sha1Hex(user.getUserPassword() + user.getUserSalt()));
            LOGGER.info("userPassword:{}", user.getUserPassword());
            if (userMapper.insert(user) >= 1)
                return new UserLoginExecution(user.getUserName(),UserLoginEnum.REGISTER_SUCCES,user);
            return new UserLoginExecution(user.getUserName(),UserLoginEnum.SYSTEM_ERROR);
        }catch (UserLoginException uex){
            throw uex;
        }catch (Exception ex){
            LOGGER.error(ex.getMessage(),ex);
            throw ex;
        }
    }

    /**
     * 实现用户登录服务接口
     * @param user
     * @return
     */
    @Override
    public boolean userLogin(User user) {
        try{
            String salt = extUserMapper.selectUserSaltByUserNameAndCheckUserName(user.getUserName());
            LOGGER.info("Salt:{}",salt);
            if(salt == null || salt == " ")
                return false;
            user.setUserPassword(DigestUtils.sha1Hex(user.getUserPassword() + salt));
            String login = extUserMapper.userLoginByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
            LOGGER.info("login:{}",login);
            if(login != null && login != " ")
                return true;
            return false;
        }catch (Exception ex)
        {
            LOGGER.error(ex.getMessage(),ex);
            throw new UserLoginException("登录失败:"+ex.getMessage());
        }
    }

    @Override
    public List<User> userQueryAll() {
        return userMapper.selectAll();
    }
}
