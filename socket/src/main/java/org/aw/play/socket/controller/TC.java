package org.aw.play.socket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Irvin
 * @description
 * @date 2022/1/11 13:46
 */
@RestController
@RequestMapping("/t")
public class TC {


    @GetMapping
    public String t1(){
        System.out.println("接受收到请求");
        return "1";
    }

}
