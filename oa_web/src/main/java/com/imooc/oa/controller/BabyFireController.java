package com.imooc.oa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.imooc.oa.biz.BabyBiz;
import com.imooc.oa.biz.BabyFireBiz;
import com.imooc.oa.dto.RespEntity;
import com.imooc.oa.entity.Baby;
import com.imooc.oa.entity.BabyFire;
import com.imooc.oa.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller("babyFireController")
@RequestMapping("/babyFire")
public class BabyFireController {
    @Autowired
    private BabyFireBiz babyFireBiz;
    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",babyFireBiz.getAll());
        return "babyFire_list";
    }
    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("babyFire",new BabyFire());
        return "babyFire_add";
    }
    @RequestMapping("/add")
    public String add(BabyFire babyFire){
        babyFireBiz.add(babyFire);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "bf_id")
    public String toUpdate(Integer bf_id, Map<String,Object> map){
        map.put("babyFire",babyFireBiz.get(bf_id));
        System.out.println("======================================to_update");
        System.out.println(babyFireBiz.get(bf_id));
        return "babyFire_update";
    }
    @RequestMapping("/update")
    public String update(BabyFire babyFire){
        babyFireBiz.edit(babyFire);
        return "redirect:list";
    }
    @RequestMapping(value = "/remove",params = "bf_id")
    public String remove(Integer bf_id){
        babyFireBiz.remove(bf_id);
        return "redirect:list";
    }

    @RequestMapping(value = "/post_add_babyFire", method = RequestMethod.POST)
    @ResponseBody
    public String post_add_babyFire(BabyFire babyFire) throws JsonProcessingException {
        System.out.println("接收到的的数据：" + babyFire);
        babyFireBiz.add(babyFire);
        return JsonUtils.getJson(new RespEntity("OK", 0));
    }

    @RequestMapping(value = "/post_get_babyFire", method = RequestMethod.POST)
    @ResponseBody
    public String post_get_babyFire() throws JsonProcessingException {
        return JsonUtils.getJson(babyFireBiz.getAll());
    }

}
