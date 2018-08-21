package org.lewis.dubbo.node.one.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@PropertySource("classpath:application.properties")
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class ServerConfig extends WebMvcAutoConfiguration {

}
