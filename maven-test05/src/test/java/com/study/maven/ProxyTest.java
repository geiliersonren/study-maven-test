package com.study.maven;

import com.study.maven.proxy.User;
import com.study.maven.proxy.config.SpringCofig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: ProxyTest
 * Package: com.study.maven
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 14:34
 * @Version 1.0
 */
public class ProxyTest {

    @Test
    public void  ProxyTest01() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCofig.class);

        User user = (User) context.getBean("user",User.class);
        user.run();

    }
}
