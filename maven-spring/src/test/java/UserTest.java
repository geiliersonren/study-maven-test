import com.study.spring.User;
import com.study.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: UserTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/15 10:06
 * @Version 1.0
 */
public class UserTest {

    @Test
    public void beanTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);
        user.add();
    }

    @Test
    public void bean2Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = (UserService) context.getBean("userService");

        userService.add();
    }

    @Test
    public void bean4Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);
        userService.add();
        System.out.println("使用注解完成bean创建对象");
    }
}
