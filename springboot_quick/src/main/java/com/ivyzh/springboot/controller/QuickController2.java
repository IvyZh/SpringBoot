package com.ivyzh.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot的配置文件-通过@ConfigurationProperties映射数据
 * 注意：使用@ConfigurationProperties方式可以进行配置文件与实体字段的自动映射，但需要字段必须提供set方法才可以，而使用@Value注解修饰的字段不需要提供set方法
 */
@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController2 {

    private String name;
    private int age;
    private String addr;

    @RequestMapping("/show2")
    public String show2() {
        return "show..." + name + "," + age + "," + addr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
