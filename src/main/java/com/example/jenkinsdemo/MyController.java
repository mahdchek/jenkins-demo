package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@RestController
public class MyController {


    @PostConstruct
    public void test() {
        Stream.of(1, 2, 3)
                .filter(value -> value <= 2)
                .map(value -> value + 10)
                .forEach(System.out::println);
    }


}
