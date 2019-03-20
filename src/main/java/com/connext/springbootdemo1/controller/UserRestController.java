package com.connext.springbootdemo1.controller;

import com.connext.springbootdemo1.entity.User;
import com.connext.springbootdemo1.mapper.UserMapper;
import com.connext.springbootdemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-20
 */
@RestController
public class UserRestController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(path = {"/insert"})
    public boolean insertUser() {
        int k = 6000;
        for (int i = 1; i <= k; i++) {
            User user = new User("Chuckie " + i, 20 + i);
            userRepository.save(user);
        }
        return true;
    }

    @RequestMapping(path = {"/create"})
    public boolean createUserTable() {
        userMapper.dropTable();
        userMapper.createTable();
        return true;
    }

    @RequestMapping(path = {"/m/insert"})
    public boolean save() {
        for(int i = 1 ; i<= 100;i++){
            User user = new User("Chuckie" + i,20 + i);
            userMapper.insert(user);
        }
        return true;
    }

    @RequestMapping(path = {"/findAll"})
    public List<User> findAll() {
        List<User> users= userMapper.findAll();
        return users;
    }

}
