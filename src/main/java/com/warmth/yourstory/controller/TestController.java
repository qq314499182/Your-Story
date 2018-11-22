package com.warmth.yourstory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie
 * @createTime 2018-11-22
 * @description Test
 */
@RestController
public class TestController {

    @GetMapping()
    public String SayHello(){
        return "hill";
    }
}
