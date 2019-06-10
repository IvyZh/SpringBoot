package com.ivyzh.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickController {

    //SpringBoot的配置文件-通过@Value映射数据
    @Value("${person.name}")
    private String pName;
    @Value("${student.name}")
    private String sName;
    @Value("${student.age}")
    private int sAge;

    @RequestMapping("/quick")
    public String quick() {
        return "quick...";
    }


    @RequestMapping("/show")
    public String show() {
        return "show..."+pName+","+sName+","+sAge;
    }
}
