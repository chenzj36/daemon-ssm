package com.imooc.oa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.imooc.oa.biz.AdministerBiz;
import com.imooc.oa.biz.BabyBiz;
import com.imooc.oa.dto.RespEntity;
import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Baby;
import com.imooc.oa.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller("babyController")
@RequestMapping("/baby")
public class BabyController {
    @Autowired
    private BabyBiz babyBiz;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",babyBiz.getAll());
        return "baby_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("baby",new Baby());
        return "baby_add";
    }
    @RequestMapping("/add")
    public String add(Baby baby){
        babyBiz.add(baby);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "b_id")
    public String toUpdate(Integer b_id, Map<String,Object> map){
        map.put("baby",babyBiz.get(b_id));
        System.out.println("======================================to_update");
        System.out.println(babyBiz.get(b_id));
        return "baby_update";
    }
    @RequestMapping("/update")
    public String update(Baby baby){
        babyBiz.edit(baby);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "b_id")
    public String remove(Integer b_id){
        babyBiz.remove(b_id);
        return "redirect:list";
    }

    @RequestMapping(value = "/post_add_baby", method = RequestMethod.POST)
    @ResponseBody
    public String post_add_baby(Baby baby) throws JsonProcessingException {
        System.out.println("接收到的的数据：" + baby);
        babyBiz.add(baby);
        return JsonUtils.getJson(new RespEntity("OK", 0));
    }

    @RequestMapping(value = "/post_get_baby", method = RequestMethod.POST)
    @ResponseBody
    public String post_get_baby() throws JsonProcessingException {
        return JsonUtils.getJson(babyBiz.getAll());
    }

}
