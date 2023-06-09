package com.ashu.practice.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class VersionController {

    @GetMapping(path = "/version")
    public String getVersion() {
        log.info("Version endpoint called");
        return "1.0";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
