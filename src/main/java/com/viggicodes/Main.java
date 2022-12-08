package com.viggicodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // part of spring web mvc
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")  // part of mvc
    public GreetResponse greet() {
        return new GreetResponse("Hello");
    }

    record GreetResponse(String greet){} // its basically like getter / setter for a variable
}
