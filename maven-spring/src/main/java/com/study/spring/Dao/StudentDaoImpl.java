package com.study.spring.Dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: StudentDaoImpl
 * Package: com.study.spring.Dao
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 10:27
 * @Version 1.0
 */
@Repository(value = "studentDaoImpl")
public class StudentDaoImpl implements StudentDao{

    @Override
    public void studentName() {
        System.out.println("studentName");
    }
}
