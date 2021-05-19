package com.ck.service;

import com.ck.entity.Book;

import java.util.List;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/18 15:38
 */
public interface IBookService {
    public List<Book> queryAll();
}
