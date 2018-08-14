package com.controller;

import com.module.service.impl.PageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by cxg on 2018/6/22.
 *
 * @author 作者 :曹锡贵
 * @version 创建时间：2018/6/22  15:16
 *          类说明
 */
@Controller
public class PageDataController {

    @Autowired
    private PageDataService pageDataService;

    @RequestMapping(value = "/pageDataboard")
    public  @ResponseBody String pagedataController(@RequestBody String data){

        pageDataService.pageDataService(data);
        return null;
    }

    @RequestMapping("/page")
    @ResponseBody
    public String pagaDataRequest(){

        return "/pageDataboard.jsp";
    }
}
