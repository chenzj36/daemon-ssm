package com.imooc.oa.dao;

import com.imooc.oa.entity.Administer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("AdministerDao")
public interface AdministerDao {
    void insert(Administer administer);
    void update(Administer administer);
    void delete(Integer id);
    Administer select(Integer id);
    List<Administer> selectAll();
}
