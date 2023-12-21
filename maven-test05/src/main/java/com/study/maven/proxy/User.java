package com.study.maven.proxy;

import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * Package: com.study.maven.proxy
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 14:24
 * @Version 1.0
 */
@Component(value = "user")
public class User {

    public void run() {
        System.out.println("user run");
    }

}
