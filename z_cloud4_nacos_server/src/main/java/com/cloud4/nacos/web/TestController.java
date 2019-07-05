package com.cloud4.nacos.web;

import com.alibabacloud2.commons.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: HeYongLiu
 * @create: 07-05-2019
 * @description:
 **/
@Slf4j
@RestController
public class TestController {

    @GetMapping(Constants.CLOUD4 + "/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = {}" , name);
        return "hello " + name;
    }

}
