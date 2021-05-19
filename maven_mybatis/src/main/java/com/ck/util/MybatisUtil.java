package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/3/22 17:23
 */
public class MybatisUtil {
    private  static SqlSessionFactory factory;
    static {
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
            factory= new SqlSessionFactoryBuilder().build(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession openSession(boolean transaction){
        return  factory.openSession(transaction);
    }
}
