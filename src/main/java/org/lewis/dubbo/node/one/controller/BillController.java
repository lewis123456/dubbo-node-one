package org.lewis.dubbo.node.one.controller;


import lombok.extern.log4j.Log4j;
import org.lewis.dubbo.node.two.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bill")
@Log4j
public class BillController {
    @Autowired
    private BillService billService;

    @RequestMapping("createBill")
    public boolean createBill() {
        log.info("createBill");
        return billService.createBill();
    }

    @RequestMapping("downloadBill")
    public boolean downloadBill() {
        log.info("downloadBill");
        return billService.downloadBill();
    }
}
