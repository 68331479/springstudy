package com.kuang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//等价于 在XML中配置了 <bean id="user" class="com.kuang.pojo.User"/>
public class User {
    @Value("ldeng")
    public String name;
}
