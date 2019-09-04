package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.BabyBiz;
import com.imooc.oa.biz.BabyFireBiz;
import com.imooc.oa.dao.BabyDao;
import com.imooc.oa.dao.BabyFireDao;
import com.imooc.oa.entity.Baby;
import com.imooc.oa.entity.BabyFire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("babyFireBiz")
public class BabyFireBizImpl implements BabyFireBiz {
    @Autowired
    private BabyFireDao babyFireDao;

    public void add(BabyFire babyFire) {
        babyFireDao.insert(babyFire);
    }

    public void edit(BabyFire baby) {
        babyFireDao.update(baby);
    }


    public void remove(Integer bf_id) {
        babyFireDao.delete(bf_id);
    }

    public BabyFire get(Integer bf_id) {
        return babyFireDao.select(bf_id);
    }

    public List<BabyFire> getAll() {
        return babyFireDao.selectAll();
    }
}
