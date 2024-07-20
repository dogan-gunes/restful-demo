package com.dgn.restful_demo.repository;

import com.dgn.restful_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
