import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("test commit");
    }
}
