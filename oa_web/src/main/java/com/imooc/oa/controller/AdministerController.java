package com.imooc.oa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.imooc.oa.biz.AdministerBiz;
import com.imooc.oa.biz.DepartmentBiz;
import com.imooc.oa.dto.RespEntity;
import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Department;
import com.imooc.oa.utils.JsonUtils;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller("administerController")
@RequestMapping("/administer")
public class AdministerController {
    @Autowired
    private AdministerBiz administerBiz;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",administerBiz.getAll());
        return "administer_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("administer",new Administer());
        return "administer_add";
    }
    @RequestMapping("/add")
    public String add(Administer administer){
        administerBiz.add(administer);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "id")
    public String toUpdate(Integer id, Map<String,Object> map){
        map.put("administer",administerBiz.get(id));
        System.out.println("======================================to_update");
        System.out.println(administerBiz.get(id));
        return "administer_update";
    }
    @RequestMapping("/update")
    public String update(Administer administer){
        administerBiz.edit(administer);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "id")
    public String remove(Integer id){
        administerBiz.remove(id);
        return "redirect:list";
    }

    @RequestMapping(value = "/post_add_administer", method = RequestMethod.POST)
    @ResponseBody
    public String post_add_administer(Administer administer) throws JsonProcessingException {
        System.out.println("接收到的的数据：" + administer);
        administerBiz.add(administer);
        return JsonUtils.getJson(new RespEntity("OK", 0));
    }

    @RequestMapping(value = "/post_get_administer", method = RequestMethod.POST)
    @ResponseBody
    public String post_get_administer() throws JsonProcessingException {
        return JsonUtils.getJson(administerBiz.getAll());
    }

}
