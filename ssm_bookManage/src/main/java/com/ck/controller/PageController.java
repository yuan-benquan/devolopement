package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/14 11:40
 */
@Controller
public class PageController {
    @RequestMapping("page")
    public String page(String page){
        return page;
    }
}
