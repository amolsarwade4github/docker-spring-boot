package com.example.docker.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greet")
public class GreetingController {

    @GetMapping(path = "{name}")
    public String greet(@PathVariable("name") String name) {
        return "<h1>Hello " + name + "</h1>";
    }

}
