package com.kuang.diy;

//方式三 使用注解方式实现AOP

import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect//标记该类是切面
@Component // 注册该类到IOC
public class AnnotationPointCut {

    @Pointcut("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("方法执行前！！！！！");
    }
    @After("pointCut()")
    public void after(){
        System.out.println("方法执行后！！！！！");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");

        UserService target = (UserServiceImpl)jp.getTarget();
        System.out.println(jp.getSignature());
        System.out.println(target.toString());

        Object proceed = jp.proceed();
        System.out.println(proceed);

        System.out.println("环绕后");
    }
}
