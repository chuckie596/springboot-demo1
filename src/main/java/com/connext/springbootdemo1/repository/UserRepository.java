package com.connext.springbootdemo1.repository;

import com.connext.springbootdemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-20
 */
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByNameLike(String name);

}
