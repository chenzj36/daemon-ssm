package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.AdministerBiz;
import com.imooc.oa.biz.BabyBiz;
import com.imooc.oa.dao.AdministerDao;
import com.imooc.oa.dao.BabyDao;
import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Baby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("babyBiz")
public class BabyBizImpl implements BabyBiz {
    @Autowired
    private BabyDao babyDao;

    public void add(Baby baby) {
        babyDao.insert(baby);
    }

    public void edit(Baby baby) {
        babyDao.update(baby);
    }


    public void remove(Integer b_id) {
        babyDao.delete(b_id);
    }

    public Baby get(Integer b_id) {
        return babyDao.select(b_id);
    }

    public List<Baby> getAll() {
        return babyDao.selectAll();
    }
}
