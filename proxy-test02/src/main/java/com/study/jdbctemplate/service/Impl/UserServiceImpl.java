package com.study.jdbctemplate.service.Impl;

import com.study.jdbctemplate.User;
import com.study.jdbctemplate.dao.UserDao;
import com.study.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.study.jdbctemplate.service.Impl
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:15
 * @Version 1.0
 */

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired()
    private UserDao userDao;

    @Override
    public int updateUser(User user){
        return userDao.jdbcAdd(user);
    }

    @Override
    public int queryCount() {
        return userDao.queryCount();
    }


}
