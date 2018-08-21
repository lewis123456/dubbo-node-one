package org.lewis.dubbo.node.one.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.lewis.dubbo.node.one")
public class Server {
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
}
