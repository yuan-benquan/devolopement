package com.ck.test;

import com.ck.dao.impl.GoodsDaoImpl;
import org.junit.Test;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/13 10:49
 */
public class Mytest {

    @Test
    public void test1(){
        System.out.println(new GoodsDaoImpl().queryAll());
    }
}
