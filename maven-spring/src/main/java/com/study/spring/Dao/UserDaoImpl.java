package com.study.spring.Dao;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserDao
 * Package: com.study.spring.Dao
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/15 14:30
 * @Version 1.0
 */

@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao{

   // private String userDaoName;

    @Override
    public void add() {
        System.out.println("userDaoImpl out");
    }
}
