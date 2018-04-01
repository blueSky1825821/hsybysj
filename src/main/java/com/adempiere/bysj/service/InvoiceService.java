package com.adempiere.bysj.service;

import com.adempiere.bysj.domain.InvoiceDO;
import com.adempiere.bysj.domain.SalesOrderDO;

import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
public interface InvoiceService {
    Long save(InvoiceDO invoiceDO);

    List<InvoiceDO> query(String documentNo, String client, Integer invoiceId, Integer orderId);

    Long delete(Integer invoiceId);

    Long update(InvoiceDO invoiceDO);
}
