package com.ivyzh.springboot.mapper;

import com.ivyzh.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper//@Mapper 标记该类是一个mybatis的mapper接口，可以被springboot自动扫描到spring上下文中
public interface UserMapper {
    List<User> queryUserList();
}
