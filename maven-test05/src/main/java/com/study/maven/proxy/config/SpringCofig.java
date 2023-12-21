package com.study.maven.proxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName: SpringCofig
 * Package: com.study.maven.proxy.config
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 14:25
 * @Version 1.0
 */

@Configuration()
@ComponentScan(basePackages = "com.study")
@EnableAspectJAutoProxy()
public class SpringCofig {
}
