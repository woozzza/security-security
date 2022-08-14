package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        // build.gradle 파일에 implementation project (":comp-common-utils")
        // 따라서 다른 모듈에 있는 클래스 사용 가능
        Person p = Person.builder().name("test").build();

        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
