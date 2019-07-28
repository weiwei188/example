package com.firstspringboot.springboot;

import com.firstspringboot.springboot.controller.AnotherHtmlController;
import com.firstspringboot.springboot.controller.HtmlController;
import com.firstspringboot.springboot.dao.UserDao;
import com.firstspringboot.springboot.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName: Springboot01HelloApplication
 * @Description: 启动spring boot项目
 * @Author: WeiWei
 * @Date: 2019-07-24 14:56
 */

@SpringBootApplication(scanBasePackages ={"com.firstspringboot.springboot"})
//用于返回字符串
@RestController
@MapperScan("com.firstspringboot.springboot.dao")
public class Springboot01HelloInitApplication {
    //该注解必须添加，否则无法访问url
   /* @Autowired
    private UserDao userDao;

    @RequestMapping("")
    public String home(){
        User user1=userDao.selectUserById(1);
        if (user1==null){
            return "用户对象不存在";
        }
        else{
            return user1.getId()+" "+user1.getName()+" "+user1.getAge()+" "
                    +user1.getSex()+" "+user1.getRegister_action()+" "
                    +user1.getTelephone()+" "+user1.getThird_party_id()+" "
                    +user1.getPassword();
        }
    }*/

    public static void main(String[] args) {
        SpringApplication.run(Springboot01HelloInitApplication.class, args);
//        HtmlController htmlController =new HtmlController();
//        htmlController.returnView();
//
//        AnotherHtmlController anotherHtmlController=new AnotherHtmlController();
//        anotherHtmlController.returnView();
    }
}

