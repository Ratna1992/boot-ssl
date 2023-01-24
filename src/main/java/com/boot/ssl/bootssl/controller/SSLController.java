package com.boot.ssl.bootssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/ssl")
public class SSLController {
    @GetMapping
    public String getSSL(){
        return "SSL Handshake";
    }
}
