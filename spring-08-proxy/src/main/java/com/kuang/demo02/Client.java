package src.main.java.com.kuang.demo02;

public class Client {

    public static void main(String[] args) {
        UserServiceImpl userService=new UserServiceImpl();
        UserServiceProxy proxy=new UserServiceProxy();
        //不改变原有类的基础上通过代理对象扩展了日志功能
        proxy.setUserService(userService);
        proxy.add();
    }
}
