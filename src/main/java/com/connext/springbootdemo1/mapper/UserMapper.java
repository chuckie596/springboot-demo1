package com.connext.springbootdemo1.mapper;

import com.connext.springbootdemo1.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-20
 */
@Mapper
public interface UserMapper {

    @Delete("drop table if exists t_users")
    void dropTable();

    @Insert("create table t_users (id int primary key AUTO_INCREMENT, name VARCHAR(100), age int)")
    void createTable();

    @Insert("insert into t_users(name,age) values(#{name},#{age})")
    void insert(User user);

    @Select("select id,name,age from t_users")
    List<User> findAll();

    @Select("select id,name,age from t_users where name like #{name}")
    List<User> findByNameLike(String name);

    @Delete("delete from t_users")
    void deleteAll();
}
