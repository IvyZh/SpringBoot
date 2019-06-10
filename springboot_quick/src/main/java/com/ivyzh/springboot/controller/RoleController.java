package com.ivyzh.springboot.controller;

import com.ivyzh.springboot.domain.Role;
import com.ivyzh.springboot.domain.User;
import com.ivyzh.springboot.mapper.UserMapper;
import com.ivyzh.springboot.repository.RoleReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleReposity roleReposity;

    @RequestMapping("/queryRole")
    @ResponseBody
    public List<Role> queryRole() {
        List<Role> roles = roleReposity.findAll();
        for (Role role : roles) {
            System.out.println(role);
        }
        return roles;
    }
}
