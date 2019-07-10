package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @创建人 JianBo Zhang
 * @创建时间 2019-07-02
 * @描述
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;
    public List<String>  getAll(){
        return restTemplate.getForObject("http://service-member/list", List.class);
    }

}
