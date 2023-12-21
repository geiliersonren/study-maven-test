package com.study.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ClassName: MavenTest
 * Package: com.study.maven
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/14 13:41
 * @Version 1.0
 */
public class MavenTest {

    @Test
    public void testAsser(){
        int a = 10;
        int b = 10;
        Assertions.assertEquals(a+b,20);
    }
}
