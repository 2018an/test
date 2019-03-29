package com.example.demo.controller;


import com.example.demo.entity.Test;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lorne on 2017/6/26.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @GetMapping("/list")
    @ResponseBody
    public List<Test> list(){
        return demoService.list();
    }


    @GetMapping("/save")
    @ResponseBody
    public int save(){
        return demoService.save();
    }

    @PostMapping("/testPost")
    @ResponseBody
    public int testPost(){
        return demoService.save();
    }
}
