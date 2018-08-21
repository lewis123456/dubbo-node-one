package org.lewis.dubbo.node.one.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.log4j.Log4j;
import org.lewis.dubbo.node.one.UserService;
import org.springframework.beans.factory.annotation.Value;

@Log4j
@Service
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private int serverPort;

    @Override
    public String getUserName() {
        return "lewis";
    }

    @Override
    public String getUserPassword() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            log.error(e);
        }
        return serverPort + "Abcd1234.";
    }

    @Override
    public int getServerPort() {
        return serverPort;
    }
}
