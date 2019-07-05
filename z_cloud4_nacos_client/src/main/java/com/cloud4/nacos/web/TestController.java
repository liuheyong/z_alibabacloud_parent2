package com.cloud4.nacos.web;

import com.alibabacloud2.commons.constants.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author: HeYongLiu
 * @create: 07-05-2019
 * @description: 调用其他服务&被调用
 **/
@Slf4j
@RestController
public class TestController {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping(Constants.CLOUD4 + "/test")
    public Mono<String> test() {
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://zcloud4nacosserver/cloud4/hello?name=codedog")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }

    @GetMapping(Constants.CLOUD4 + "/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = :[{}]" , name);
        return "hello " + name;
    }

}
