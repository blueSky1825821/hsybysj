package com.adempiere.bysj.service;

import com.adempiere.bysj.domain.SalesOrderDO;

import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
public interface SalesOrderService {
    Long delete(Integer orderId);

    Long update(SalesOrderDO salesOrderDO);

    Long save(SalesOrderDO salesOrderDO);

    List<SalesOrderDO> query(String documentNo, String client, Integer orderId);
}
