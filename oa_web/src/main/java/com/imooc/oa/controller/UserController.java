package com.imooc.oa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.imooc.oa.dto.RespEntity;
import com.imooc.oa.entity.Department;
import com.imooc.oa.pojo.LoginVerify;
import com.imooc.oa.pojo.User;
import com.imooc.oa.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/json1")
    @ResponseBody
    public String json1() throws JsonProcessingException {
        //jackson的对象映射器，可以直接将对象映射为json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        //创建一个字符串
        User user = new User("陈作钧", 1, "男");
        //将Java对象转换为json字符串
        String str = objectMapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/json3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JsonUtils.getJson(list); //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
    }

    @RequestMapping("/time")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date); //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
    }

    @RequestMapping("/to_post1")
    public String toPost(Map<String,Object> map){
        map.put("user",new User());
        return "post1";
    }

    @RequestMapping(value = "/post1", method = RequestMethod.POST)
    @ResponseBody
    public String login(String name, int age, String sex) throws JsonProcessingException {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        System.out.println("接收到的的数据：" + user);
        return JsonUtils.getJson(new RespEntity("OK", 0));
    }

    @RequestMapping(value = "/post_login")
    @ResponseBody
    public String login(String uname, String passwd) throws JsonProcessingException {
        LoginVerify loginVerify = new LoginVerify();
        loginVerify.setName(uname);
        loginVerify.setPasswd(passwd);
        System.out.println("接收到的的数据：" + loginVerify);
        return JsonUtils.getJson(loginVerify);
    }

}
