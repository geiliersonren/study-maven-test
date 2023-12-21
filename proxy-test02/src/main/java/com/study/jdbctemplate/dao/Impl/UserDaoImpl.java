package com.study.jdbctemplate.dao.Impl;

import com.study.jdbctemplate.User;
import com.study.jdbctemplate.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDaoImpl
 * Package: com.study.jdbctemplate.dao.Impl
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:13
 * @Version 1.0
 */
@Repository()
public class UserDaoImpl implements UserDao {

    @Autowired()
    private JdbcTemplate jdbcTemplate;


    @Override
    public int jdbcAdd(User user){
        String sql = "insert into user value(?,?,?)";

        int rows = jdbcTemplate.update(sql, user.getUsername(), user.getAge(), user.getBirthTime());
        return rows;
    }

    @Override
    public int queryCount() {
        String sql = "select count(1) from user";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }
}
