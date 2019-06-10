package com.ivyzh.springboot;

import com.ivyzh.springboot.domain.Role;
import com.ivyzh.springboot.repository.RoleReposity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuickApplication.class)
public class JpaTest {
    @Autowired
    private RoleReposity roleReposity;

    @Test
    public void test() {
        System.out.println(roleReposity);

        List<Role> roles = roleReposity.findAll();
        for (Role role : roles) {
            System.out.println(role);
        }
    }

}
