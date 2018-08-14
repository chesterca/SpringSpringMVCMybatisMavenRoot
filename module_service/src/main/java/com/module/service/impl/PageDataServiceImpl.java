package com.module.service.impl;

import com.module.dao.PageDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cxg on 2018/6/22.
 *
 * @author 作者 :曹锡贵
 * @version 创建时间：2018/6/22  15:22
 *          类说明
 */

@Service
public class PageDataServiceImpl implements PageDataService {

    @Autowired
    private PageDataDao pageDataDao;

    @Override
    public String pageDataService(String data) {

        pageDataDao.pageDataDao(data);
        return null;
    }
}
