package com.ivyzh.springboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivyzh.springboot.domain.Role;
import com.ivyzh.springboot.repository.RoleReposity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuickApplication.class)
public class RedisTest {
    @Autowired
    private RoleReposity roleReposity;

    @Autowired
    RedisTemplate<String, String> redisTemplate;

    @Test
    public void test() throws JsonProcessingException {
        String roles = redisTemplate.boundValueOps("role.findAll").get();
        if (roles == null) {
            System.out.println("redis没有数据");
            List<Role> list = roleReposity.findAll();
            ObjectMapper mapper = new ObjectMapper();
            String value = mapper.writeValueAsString(list);
            redisTemplate.boundValueOps("role.findAll").set(value);

            System.out.println("从数据库中读取数据");
            for (Role role : list) {
                System.out.println(role);
            }
        }else {
            System.out.println("redis有数据-->"+roles);
        }

    }

}
