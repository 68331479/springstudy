package src.main.java.com.kuang.demo03;


import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{


    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成到代理类对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        seeHouse();
        //动态代理的哦本质就是使用反射机制实现
        Object result = method.invoke(rent, args);
        fee();
        return result;
    }

    public void seeHouse(){
        System.out.println("中介带看房子。。。");
    }

    public void fee(){
        System.out.println("中介收取中介费。。。");
    }
}
