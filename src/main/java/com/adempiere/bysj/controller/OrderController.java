package com.adempiere.bysj.controller;

import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.domain.User;
import com.adempiere.bysj.service.SalesOrderService;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Resource
    private SalesOrderService salesOrderService;

    @RequestMapping(value = "/save")
    public Long save(@RequestParam SalesOrderDO salesOrderDO) {
        return salesOrderService.save(salesOrderDO);
    }

    @RequestMapping(value = "/query")
    public List<SalesOrderDO> query(@RequestParam(value = "documentNo", required = false) String documentNo,
                                    @RequestParam(value = "orderId", required = false) Integer orderId,
                                    @RequestParam(value = "client", required = false) String client) {
        return salesOrderService.query(documentNo, client, orderId);
    }
}
