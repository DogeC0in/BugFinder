package com.dogecoin.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/test")
    public Mono<String> testOne(){
        return Mono.just("testOne");
    }

    @GetMapping("/test1")
    public Mono<String> testTwo(){
        return Mono.just("testTwo");
    }
}
