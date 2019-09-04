package com.imooc.oa.biz;

import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Baby;

import java.util.List;

public interface BabyBiz {
    void add(Baby baby);
    void edit(Baby baby);
    void remove(Integer id);
    Baby get(Integer id);
    List<Baby> getAll();
}
