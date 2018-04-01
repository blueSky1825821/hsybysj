package com.adempiere.bysj.service.impl;

import com.adempiere.bysj.domain.InvoiceDO;
import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.mapper.InvoiceRepository;
import com.adempiere.bysj.mapper.SalesOrderRepository;
import com.adempiere.bysj.service.InvoiceService;
import com.adempiere.bysj.service.SalesOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Resource
    private InvoiceRepository invoiceRepository;

    @Override
    public Long save(InvoiceDO salesOrderDO) {
        return invoiceRepository.save(salesOrderDO);
    }

    @Override
    public List<InvoiceDO> query(String documentNo, String client, Integer invoiceId, Integer orderId) {
        return invoiceRepository.query(documentNo, client, invoiceId, orderId);
    }

    @Override
    public Long delete(Integer invoiceId) {
        return invoiceRepository.delete(invoiceId);
    }

    @Override
    public Long update(InvoiceDO invoiceDO) {
        return invoiceRepository.update(invoiceDO);
    }
}
