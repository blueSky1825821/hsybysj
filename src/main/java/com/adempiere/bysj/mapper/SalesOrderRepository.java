package com.adempiere.bysj.mapper;

import com.adempiere.bysj.domain.SalesOrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@Mapper
public interface SalesOrderRepository {
    Long delete(@Param("invoiceId") Integer orderId);

    Long update(@Param("invoiceDO") SalesOrderDO salesOrderDO);

    Long save(@Param("salesOrderDO") SalesOrderDO salesOrderDO);

    List<SalesOrderDO> query(@Param("documentNo") String documentNo, @Param("client") String client, @Param("orderId") Integer orderId);
}
