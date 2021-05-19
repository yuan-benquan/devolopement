package com.ck.dao;

import com.ck.entity.Book;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/18 15:25
 */
public interface IBookDao {
    //查询所有图书
    @Select("select * from bookinfo")
    @ResultMap("book")
    public List<Book> queryALl();
}
