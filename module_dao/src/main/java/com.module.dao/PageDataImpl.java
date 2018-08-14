package com.module.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by cxg on 2018/6/22.
 *
 * @author 作者 :曹锡贵
 * @version 创建时间：2018/6/22  15:23
 *          类说明
 */
@Repository
public class PageDataImpl implements PageDataDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    @Override
    public String pageDataDao(String data) {

        System.out.println("输出的数据为"+data);
        return null;
    }
}
