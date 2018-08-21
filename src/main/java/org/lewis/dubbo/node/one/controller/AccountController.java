package org.lewis.dubbo.node.one.controller;

import lombok.extern.log4j.Log4j;
import org.lewis.dubbo.node.two.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
@Log4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("accountRecharge")
    public String accountRecharge() {
        log.info("accountRecharge");
        return accountService.accountRecharge();
    }

    @RequestMapping("accountRefund")
    public String accountRefund() {
        log.info("accountRefund");
        return accountService.accountRefund();
    }

    @RequestMapping("accountWithdraw")
    public String accountWithdraw() {
        log.info("accountWithdraw");
        return accountService.accountWithdraw();
    }
}
