package src.main.java.com.kuang.demo04;

import src.main.java.com.kuang.demo02.UserService;
import src.main.java.com.kuang.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实对象
        UserServiceImpl userService = new UserServiceImpl();
        //代理对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy =(UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.query();
        proxy.update();
    }
}
