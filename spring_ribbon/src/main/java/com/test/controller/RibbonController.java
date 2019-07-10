package com.test.controller;

import com.test.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @创建人 JianBo Zhang
 * @创建时间 2019-07-02
 * @描述
 */
@RestController
public class RibbonController {

    @Autowired
    public RibbonService service;

    @RequestMapping("getall")
    public List<String> getall(){
        System.out.println("开始");
        return service.getAll();
    }
}
