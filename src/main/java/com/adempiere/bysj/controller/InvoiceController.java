package com.adempiere.bysj.controller;

import com.adempiere.bysj.domain.InvoiceDO;
import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.domain.User;
import com.adempiere.bysj.service.InvoiceService;
import com.adempiere.bysj.service.SalesOrderService;
import com.adempiere.bysj.tools.HandleSession;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@RestController
@RequestMapping(value = "/invoice")
public class InvoiceController {
    @Resource
    private InvoiceService invoiceService;

    @RequestMapping(value = "/save")
    public Long save(@RequestParam InvoiceDO salesOrderDO, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return invoiceService.save(salesOrderDO);
    }

    @RequestMapping(value = "/query")
    public List<InvoiceDO> query(@RequestParam(value = "documentNo", required = false) String documentNo,
                                 @RequestParam(value = "orderId", required = false) Integer orderId,
                                 @RequestParam(value = "invoiceId", required = false) Integer invoiceId,
                                 @RequestParam(value = "client", required = false) String client,
                                 HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return invoiceService.query(documentNo, client, invoiceId, orderId);
    }

    @RequestMapping(value = "/delete")
    public Long delete(@RequestParam Integer invoiceId, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return invoiceService.delete(invoiceId);
    }

    @RequestMapping(value = "/update")
    public Long update(@RequestParam InvoiceDO salesOrderDO, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return invoiceService.update(salesOrderDO);
    }
}