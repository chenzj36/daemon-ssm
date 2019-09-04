package com.imooc.oa.dao;

import com.imooc.oa.entity.Administer;
import com.imooc.oa.entity.Baby;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("BabyDao")
public interface BabyDao {
    void insert(Baby baby);
    void update(Baby baby);
    void delete(Integer id);
    Baby select(Integer id);
    List<Baby> selectAll();
}
