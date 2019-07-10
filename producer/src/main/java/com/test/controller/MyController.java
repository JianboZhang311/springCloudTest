package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 JianBo Zhang
 * @创建时间 2019-07-01
 * @描述
 */
@RestController
public class MyController
{

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("list")
    public List<String> getAll()
    {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("serverPort=" + serverPort);
        return list;
    }

}
