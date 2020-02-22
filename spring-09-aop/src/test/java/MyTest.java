import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //接口的动态代理对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.query();
    }
}
