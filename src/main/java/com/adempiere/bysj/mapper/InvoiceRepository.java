package com.adempiere.bysj.mapper;

import com.adempiere.bysj.domain.InvoiceDO;
import com.adempiere.bysj.domain.SalesOrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@Mapper
public interface InvoiceRepository {
    Long save(InvoiceDO invoiceDO);

    Long delete(@Param("invoiceId") Integer invoiceId);

    Long update(@Param("invoiceDO") InvoiceDO invoiceDO);

    List<InvoiceDO> query(@Param("documentNo") String documentNo, @Param("client") String client, @Param("invoiceId") Integer invoiceId, @Param("orderId") Integer orderId);
}
