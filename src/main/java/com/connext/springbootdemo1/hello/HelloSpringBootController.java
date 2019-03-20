package com.connext.springbootdemo1.hello;

import com.connext.springbootdemo1.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chuckie
 * @Description
 * @date 19-3-19
 */
@RestController
public class HelloSpringBootController {
    @Autowired
    private StudentDao studentDao;
//    @RequestMapping(path = {"/helloSpringBoot"})
//    public String HelloSpring (){
//        System.out.println("hello spring boot111");
//        return "hello spring boot22";
//    }

    @RequestMapping(path = {"/helloSpringBoot/{id}"})
    public String HelloSpring1 (@PathVariable("id") String idd){
        System.out.println("hello spring boot with id = " + idd);
        return "hello spring boot idd " + idd;
    }

    @RequestMapping(path = {"/queryName"})
    public String queryName (){
        System.out.println("hello spring boot with id = ");
        String name = studentDao.queryStuName();
        return "hello name = " + name;
    }
}
