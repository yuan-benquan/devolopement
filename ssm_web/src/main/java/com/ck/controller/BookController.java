package com.ck.controller;

import com.ck.entity.Book;
import com.ck.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/18 15:40
 */
@Controller
public class BookController {

    @Autowired
    private IBookService bookService;
    @RequestMapping("queryAll")
    @ResponseBody
    public List<Book> queryall(){
        return bookService.queryAll();
    }
}
