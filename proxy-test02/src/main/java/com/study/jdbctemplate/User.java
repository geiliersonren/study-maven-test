package com.study.jdbctemplate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.study.jdbctemplate
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:12
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String username;
    private int age;
    private String birthTime;
}
