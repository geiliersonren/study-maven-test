package com.study.jdbctemplate.service;

import com.study.jdbctemplate.User;

/**
 * ClassName: UserService
 * Package: com.study.jdbctemplate.service
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:14
 * @Version 1.0
 */
public interface UserService {

    int updateUser(User user);
    int queryCount();
}
