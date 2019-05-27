package com.example.zipkinserver.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZipkinserverApplication {

    @GetMapping("/hi")
    public String hi(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZipkinserverApplication.class, args);
    }

}
