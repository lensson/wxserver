package com.lens.wxserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lens.wxserver.mapper")
public class WxserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxserverApplication.class, args);
    }

}
