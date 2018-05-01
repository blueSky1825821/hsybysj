package com.adempiere.bysj.mapper;

import com.adempiere.bysj.domain.SalesOrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wm on 2018/3/25.
 */
@Mapper
public interface SalesOrderRepository {
    SalesOrderDO queryByPrimaryKey(@Param("orderId") Integer orderId);

    Long delete(@Param("orderId") Integer orderId);

    Long update(SalesOrderDO salesOrderDO);

    Long updateOutTransNoByOrderId(@Param("orderId") Double orderId, @Param("outTradeNo") String outTradeNo);

    Long save(@Param("salesOrderDO") SalesOrderDO salesOrderDO);

    List<SalesOrderDO> query(@Param("documentNo") String documentNo, @Param("client") String client, @Param("orderId") Integer orderId, @Param("outTradeNo") String outTradeNo);
}
