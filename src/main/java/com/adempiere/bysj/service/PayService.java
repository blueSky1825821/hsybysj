package com.adempiere.bysj.service;

import com.adempiere.bysj.domain.SalesOrderDO;

/**
 * Created by wm on 2018/5/1.
 */
public interface PayService {
    /**
     * 预下单
     * @return
     */
    String tradePrecreate(SalesOrderDO salesOrderDO);
}
