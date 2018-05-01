package com.adempiere.bysj.service.impl;

import com.adempiere.bysj.domain.SalesOrderDO;
import com.adempiere.bysj.mapper.SalesOrderRepository;
import com.adempiere.bysj.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@Service
public class SalesOrderServiceImpl implements SalesOrderService{
    @Resource
    private SalesOrderRepository salesOrderRepository;

    @Override
    public SalesOrderDO queryByPrimaryKey(Integer orderId) {
        return salesOrderRepository.queryByPrimaryKey(orderId);
    }

    @Override
    public Long delete(Integer orderId) {
        return salesOrderRepository.delete(orderId);
    }

    @Override
    public Long update(SalesOrderDO salesOrderDO) {
        return salesOrderRepository.update(salesOrderDO);
    }

    @Override
    public Long save(SalesOrderDO salesOrderDO) {
        return salesOrderRepository.save(salesOrderDO);
    }

    @Override
    public Long updateOutTransNoByOrderId(Double orderId, String outTradeNo) {
        return salesOrderRepository.updateOutTransNoByOrderId(orderId, outTradeNo);
    }

    @Override
    public List<SalesOrderDO> query(String documentNo, String client, Integer orderId, String outTradeNo) {
        return salesOrderRepository.query(documentNo, client, orderId, outTradeNo);
    }


}
