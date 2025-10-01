package com.example.helloapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;                 
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Map<String,Object> helloApi() {
        
        return Map.of(
            "koreaTime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString(),
            "timestamp", System.currentTimeMillis(),
            "message", "Hello, World!"
        );
    }

    
}
