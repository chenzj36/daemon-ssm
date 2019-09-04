package com.imooc.oa.biz;

import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Department;

import java.util.List;

public interface AdministerBiz {
    void add(Administer administer);
    void edit(Administer administer);
    void remove(Integer id);
    Administer get(Integer id);
    List<Administer> getAll();
}
