package src.main.java.com.kuang.demo03;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args) {
        //真实对象
        Host host=new Host();
        //代理对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过调用程序处理角色来处理我们要调用的接口对象
         pih.setRent(host);
         //生成代理类对象
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }

}
