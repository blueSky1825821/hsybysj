package com.adempiere.bysj.controller;

import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.service.SalesOrderService;
import com.adempiere.bysj.service.PayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;

/**
 * Created by wm on 2018/4/7.
 * 二维码生成
 */
@RestController
@RequestMapping(value = "/qrcode")
public class QRCodeController {
    private static final Logger logger = LoggerFactory.getLogger(QRCodeController.class);
    @Resource
    private SalesOrderService salesOrderService;

    @Resource
    private PayService payService;

    @RequestMapping(value = "/query")
    public String query(@RequestParam String id) {
        String path = "qrcodepics";
        SalesOrderDO salesOrderDO = salesOrderService.queryByPrimaryKey(Integer.valueOf(id));
        if (salesOrderDO == null) {
            return null;
        }
        return path + File.separator + payService.tradePrecreate(salesOrderDO);
    }

}
