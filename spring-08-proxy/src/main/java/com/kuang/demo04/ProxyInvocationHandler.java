package src.main.java.com.kuang.demo04;


import src.main.java.com.kuang.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler{


    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成到代理类对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的哦本质就是使用反射机制实现
        printlog(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void printlog(String msg){
        System.out.println("[Debug]执行了"+msg+"方法");
    }

}
