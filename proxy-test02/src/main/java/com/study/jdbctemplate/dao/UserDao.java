package com.study.jdbctemplate.dao;

import com.study.jdbctemplate.User;

/**
 * ClassName: UserDao
 * Package: com.study.jdbctemplate.dao
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:13
 * @Version 1.0
 */
public interface UserDao {
    int jdbcAdd(User user);

    int queryCount();
}
