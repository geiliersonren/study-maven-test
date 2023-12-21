package com.study.maven.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * ClassName: UserProxy
 * Package: com.study.maven.proxy
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 14:29
 * @Version 1.0
 */
@Component()
@Aspect()
public class UserProxy {

    @Pointcut(value = "execution(* com.study.maven.proxy.User.run(..))")
    public void runProxy(){

    }

    @Before(value = "runProxy()")
    public void before(){
        System.out.println("run before");
    }

    @After(value = "execution(* com.study.maven.proxy.User.run(..))")
    public void after() {
        System.out.println("run after");
    }

    @AfterReturning(value = "execution(* com.study.maven.proxy.User.run(..))")
    public void AfterReturning() {
        System.out.println("run AfterReturning");
    }

    @Around(value = "execution(* com.study.maven.proxy.User.run(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("run Around before");
        proceedingJoinPoint.proceed();
        System.out.println("run Around after");
    }

    @AfterThrowing(value = "execution(* com.study.maven.proxy.User.run(..))")
    public void AfterThrowing() {
        System.out.println("run AfterThrowing");
    }
}
