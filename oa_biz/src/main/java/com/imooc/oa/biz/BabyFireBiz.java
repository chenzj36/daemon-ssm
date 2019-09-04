package com.imooc.oa.biz;

import com.imooc.oa.entity.Baby;
import com.imooc.oa.entity.BabyFire;

import java.util.List;

public interface BabyFireBiz {
    void add(BabyFire babyFire);
    void edit(BabyFire babyFire);
    void remove(Integer bf_id);
    BabyFire get(Integer bf_id);
    List<BabyFire> getAll();
}
