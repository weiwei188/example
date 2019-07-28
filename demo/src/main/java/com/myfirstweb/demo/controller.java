package com.myfirstweb.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//@Controller表示我们的这个类是一个controller,能够用来接收前台发送过来的请求，去做相应的数据的处理
//@ResponseBody 将我们的对象作为http的响应正文返回
@RestController
public class controller {
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    //SpringBoot需要一个路由，叫做RequestMapping(告诉它你是怎么能够访问到这个方法的)
    //这里的value就是启动localhost端口的那个/hello
    public String hello(){
        return "Hello SpringBoot!";
    }


}
