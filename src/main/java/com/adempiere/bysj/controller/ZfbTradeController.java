package com.adempiere.bysj.controller;

import com.adempiere.bysj.domain.InvoiceDO;
import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.service.InvoiceService;
import com.adempiere.bysj.service.PayService;
import com.adempiere.bysj.service.SalesOrderService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by wm on 2018/5/1.
 */
@RestController
@RequestMapping(value = "/zfb")
public class ZfbTradeController {
    private static final Logger logger = LoggerFactory.getLogger(ZfbTradeController.class);
    @Resource
    private PayService payService;
    @Resource
    private SalesOrderService salesOrderService;
    @Resource
    private InvoiceService invoiceService;


    @RequestMapping(value = "/tradeback.do", method = RequestMethod.POST)
    public void tradeback(HttpServletRequest request, HttpServletResponse response) {
        logger.info("/zfb/tradeback.do");
        String outTradeNo = request.getParameter("out_trade_no");
        List<SalesOrderDO> query = salesOrderService.query(null, null, null, outTradeNo);
        if (CollectionUtils.isEmpty(query)) {
            logger.error("out_trade_no :{} 查询失败", outTradeNo);
        }
        SalesOrderDO salesOrderDO = query.get(0);
        InvoiceDO invoiceDO = new InvoiceDO();
        try {
            BeanUtils.copyProperties(invoiceDO, salesOrderDO);
        } catch (IllegalAccessException | InvocationTargetException e) {
            logger.error("类型赋值异常", e);
        }
        invoiceDO.setInvoiceId(invoiceDO.getOrderId());
        invoiceService.save(invoiceDO);
    }
}
