package com.aw.play.nacosconfigserver.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestC {

    @Value("${aw.title}")
    private String awTitle;


    @GetMapping
    public String t1(){
        return StringUtils.isNotBlank(awTitle) ? awTitle : "nothing";
    }
}
