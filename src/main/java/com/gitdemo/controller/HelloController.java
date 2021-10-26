package com.gitdemo.controller;

import com.gitdemo.entity.Person;
import com.gitdemo.mapper.DemoMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private DemoMapper demoMapper;

    @ResponseBody
    @RequestMapping("/hello")
    public List<Person> hello() {
        List<Person> List = demoMapper.testSelect();
        System.out.println(List);
        return List;
    }

    @RequestMapping("/helloNodb")
    public void helloNodb() {
        System.out.println("hello");
    }

}
