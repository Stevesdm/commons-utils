package com.steve.commonloggeraction.api;

import com.steve.commonloggeraction.annotation.LogActionAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2017/11/23 下午3:50
 */
@RestController
public class DemoController {

    @GetMapping(value="/demo")
    @LogActionAnnotation(action = "hello world",module = "demo",comment = "test")
    public String demo(){
        return "hello world";
    }
}
