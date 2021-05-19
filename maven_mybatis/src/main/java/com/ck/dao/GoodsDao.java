package com.ck.dao;

import com.ck.entity.Goods;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/13 10:24
 */
public interface GoodsDao {
    @Select("select * from goods")
    public List<Goods> queryAll();
}
