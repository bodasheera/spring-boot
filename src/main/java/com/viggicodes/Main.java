package com.viggicodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

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

//    record GreetResponse(
//            String greet
//    ){} // its basically creates a class with member as greet . immutable. in built getter and setter for this member

    class GreetResponse {
        private final String greet;


        GreetResponse(String greet) {
            this.greet = greet;
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet='" + greet + '\'' +
                    '}';
        }

        public String getGreet() {
            return greet;
        }

        // use alt + insert for ggenerate equals and hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GreetResponse that = (GreetResponse) o;
            return Objects.equals(greet, that.greet);
        }

        @Override
        public int hashCode() {
            return Objects.hash(greet);
        }
    }
}
