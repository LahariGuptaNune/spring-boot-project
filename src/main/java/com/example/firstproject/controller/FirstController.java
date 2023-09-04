package com.example.firstproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/first")
@Slf4j
public class FirstController {

    @Value("${my-secret-property}")
    private String secretKeyValue;

    @GetMapping(value = "/getMessage")
    public String getMessage() {
        log.error("############## Starts:: getMessage ##############");
        log.error("---- secretKeyValue {} -----", secretKeyValue);
        return "Hello world";
    }
}
