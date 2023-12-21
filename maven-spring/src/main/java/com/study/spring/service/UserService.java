package com.study.spring.service;

import com.study.spring.Dao.StudentDao;
import com.study.spring.Dao.UserDao;
import com.study.spring.Dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserService
 * Package: com.study.spring.service
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/15 14:30
 * @Version 1.0
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    @Qualifier(value = "studentDaoImpl")
    private StudentDao studentDao;

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;
//
//    public void setUserDao(UserDao userDao) {
//        System.out.println("setUserDao");
//        this.userDao = userDao;
//    }

    public void add() {
        System.out.println("userService out ");
        studentDao.studentName();
        userDao.add();
    }
}
