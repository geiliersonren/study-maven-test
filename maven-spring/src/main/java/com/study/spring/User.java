package com.study.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: User
 * Package: com.study.spring
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/15 10:04
 * @Version 1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private int userId;
    private String username;

    public void add() {
        System.out.println("add.........");
    }
}
