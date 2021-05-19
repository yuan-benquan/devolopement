package com.ck.dao.impl;

import com.ck.dao.GoodsDao;
import com.ck.entity.Goods;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/13 10:24
 */
public class GoodsDaoImpl implements GoodsDao {
    @Override
    public List<Goods> queryAll() {
        SqlSession sqlSession = MybatisUtil.openSession(false);
        GoodsDao dao = sqlSession.getMapper(GoodsDao.class);

        return dao.queryAll();
    }
}
