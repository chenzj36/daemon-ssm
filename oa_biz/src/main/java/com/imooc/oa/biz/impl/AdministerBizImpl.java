package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.AdministerBiz;
import com.imooc.oa.dao.AdministerDao;
import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("administerBiz")
public class AdministerBizImpl implements AdministerBiz {
    @Autowired
    private AdministerDao administerDao;

    public void add(Administer administer) {
        administerDao.insert(administer);
    }

    public void edit(Administer administer) {
        administerDao.update(administer);
    }


    public void remove(Integer id) {
        administerDao.delete(id);
    }

    public Administer get(Integer id) {
        return administerDao.select(id);
    }

    public List<Administer> getAll() {
        return administerDao.selectAll();
    }
}
