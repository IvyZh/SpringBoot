package com.ivyzh.springboot.repository;

import com.ivyzh.springboot.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleReposity extends JpaRepository<Role, Long> {

    List<Role> findAll();
}
