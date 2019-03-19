package com.connext.springbootdemo1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-19
 */
@Mapper
public interface StudentDao {
    @Select({"select name from student where id = '1'"})
    String queryStuName();
}
