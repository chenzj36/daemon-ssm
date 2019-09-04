package com.imooc.oa.dao;

import com.imooc.oa.entity.Baby;
import com.imooc.oa.entity.BabyFire;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BabyFireDao")
public interface BabyFireDao {
    void insert(BabyFire babyFire);
    void update(BabyFire babyFire);
    void delete(Integer bf_id);
    BabyFire select(Integer bf_id);
    List<BabyFire> selectAll();
}
