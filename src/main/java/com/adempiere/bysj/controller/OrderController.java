package com.adempiere.bysj.controller;

import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.domain.User;
import com.adempiere.bysj.service.SalesOrderService;
import com.adempiere.bysj.tools.HandleSession;
import com.alibaba.fastjson.JSON;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
@RequestMapping(value = "/order")
public class OrderController {
    @Resource
    private SalesOrderService salesOrderService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Long save(@RequestParam SalesOrderDO salesOrderDO, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return salesOrderService.save(salesOrderDO);
    }

    @RequestMapping(value = "/query")
    public List<SalesOrderDO> query(@RequestParam(value = "documentNo", required = false) String documentNo,
                                    @RequestParam(value = "orderId", required = false) Integer orderId,
                                    @RequestParam(value = "client", required = false) String client,
                                    HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return salesOrderService.query(documentNo, client, orderId);
    }

    @RequestMapping(value = "/delete")
    public Long delete(@RequestParam Integer invoiceId, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        if (invoiceId == null) {
            return -1L;
        }
        return salesOrderService.delete(invoiceId);
    }

    @RequestMapping(value = "/update")
    public Long update(@RequestParam SalesOrderDO salesOrderDO, HttpSession session) {
        if (session.getAttribute(HandleSession.getUsername()) == null) {
            return null;
        }
        return salesOrderService.update(salesOrderDO);
    }
}
