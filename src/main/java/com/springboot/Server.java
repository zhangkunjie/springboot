package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kunjie.zhang on 2018/5/26.
 */
@SpringBootApplication
@MapperScan("com.springboot.dao")
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
