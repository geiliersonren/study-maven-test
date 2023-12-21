import com.study.jdbctemplate.User;
import com.study.jdbctemplate.service.Impl.UserServiceImpl;
import com.study.jdbctemplate.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: JdbcTemplateTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author 林七七
 * @Create 2023/12/16 20:49
 * @Version 1.0
 */
public class JdbcTemplateTest {

    @Test
    public void jdbcTemplateTest() {
        User user = new User("张三",14,"11-10");

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = (UserService) context.getBean("userService");

        int rows = userService.updateUser(user);
        int count = userService.queryCount();
        System.out.println(rows);
        System.out.println("count="+ count);
    }
}
