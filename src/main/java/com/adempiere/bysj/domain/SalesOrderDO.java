package com.adempiere.bysj.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wm on 2018/3/25.
 * 订单
 */
public class SalesOrderDO implements Serializable{
    private static final long serialVersionUID = 4939376676138141881L;
    private Integer orderId;
    //公司
    private Integer client;
    //部门
    private Integer organization;
    //文件编号
    private String documentNo;
    //订单参考
    private String OrderReference;
    //记录描述
    private String description;

//    private Integer targetDocumentType;
    //自助服务
    private Boolean selfService;
    //下单时间
    private Date dateOrdered;
    //答应交货时间
    private Date datePromised;
    //合伙人
    private Integer businessPartner;
    //发票人
    private Integer invoicePartner;
    //合伙人地址
    private Integer partnerLocation;
    //合伙人发票
    private Integer invoiceLocation;
    //内容
    private Integer userOrContact;
    //发票内容
    private Integer invoiceContact;
    //定义交货时间
    private String deliverRule;
    //优先级
    private String priority;
    //仓库
    private Integer warehouse;
    //拖放货件
    private Boolean dropShipment;
    //投递方式
    private String deliveryVia;
    //运输方式
    private String shipper;
    //运费成本规则
    private String freightCostRule;
    //运费
    private Double freightAmt;
//    private String invoiceRule;
    //本金
    private Integer priceList;
    //货币
    private Integer currency;
    private Integer currencyType;
//    private Integer salesRepresentative;
    //打印
    private Boolean discountPrinted;
    //费用类型
    private Integer charge;
    //费用金额
    private Double chargeAmount;
    //付款规则
    private String paymentRule;
    //付款条款
    private Integer paymentTerm;
    //工程
    private Integer project;
    //活动
    private Integer activity;
    //营销计划
    private Integer campaign;
    //中间人
    private Integer trxOrganization;
//    private List userList1;
//    private List userList2;
    //总数
    private Double totalLines;
    //总计
    private Double grandTotal;
//    private String documentStatus;
//    private Integer documentType;
//    private String copyLines;
//    private String processOrder;
//    private String posted;
    //订单类型
    private String orderType;

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }

    public Integer getOrganization() {
        return organization;
    }

    public void setOrganization(Integer organization) {
        this.organization = organization;
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    public String getOrderReference() {
        return OrderReference;
    }

    public void setOrderReference(String orderReference) {
        OrderReference = orderReference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSelfService() {
        return selfService;
    }

    public void setSelfService(Boolean selfService) {
        this.selfService = selfService;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Date getDatePromised() {
        return datePromised;
    }

    public void setDatePromised(Date datePromised) {
        this.datePromised = datePromised;
    }

    public Integer getBusinessPartner() {
        return businessPartner;
    }

    public void setBusinessPartner(Integer businessPartner) {
        this.businessPartner = businessPartner;
    }

    public Integer getInvoicePartner() {
        return invoicePartner;
    }

    public void setInvoicePartner(Integer invoicePartner) {
        this.invoicePartner = invoicePartner;
    }

    public Integer getPartnerLocation() {
        return partnerLocation;
    }

    public void setPartnerLocation(Integer partnerLocation) {
        this.partnerLocation = partnerLocation;
    }

    public Integer getInvoiceLocation() {
        return invoiceLocation;
    }

    public void setInvoiceLocation(Integer invoiceLocation) {
        this.invoiceLocation = invoiceLocation;
    }

    public Integer getUserOrContact() {
        return userOrContact;
    }

    public void setUserOrContact(Integer userOrContact) {
        this.userOrContact = userOrContact;
    }

    public Integer getInvoiceContact() {
        return invoiceContact;
    }

    public void setInvoiceContact(Integer invoiceContact) {
        this.invoiceContact = invoiceContact;
    }

    public String getDeliverRule() {
        return deliverRule;
    }

    public void setDeliverRule(String deliverRule) {
        this.deliverRule = deliverRule;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Integer getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Integer warehouse) {
        this.warehouse = warehouse;
    }

    public Boolean getDropShipment() {
        return dropShipment;
    }

    public void setDropShipment(Boolean dropShipment) {
        this.dropShipment = dropShipment;
    }

    public String getDeliveryVia() {
        return deliveryVia;
    }

    public void setDeliveryVia(String deliveryVia) {
        this.deliveryVia = deliveryVia;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getFreightCostRule() {
        return freightCostRule;
    }

    public void setFreightCostRule(String freightCostRule) {
        this.freightCostRule = freightCostRule;
    }

    public Double getFreightAmt() {
        return freightAmt;
    }

    public void setFreightAmt(Double freightAmt) {
        this.freightAmt = freightAmt;
    }

    public Integer getPriceList() {
        return priceList;
    }

    public void setPriceList(Integer priceList) {
        this.priceList = priceList;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Integer getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Integer currencyType) {
        this.currencyType = currencyType;
    }

    public Boolean getDiscountPrinted() {
        return discountPrinted;
    }

    public void setDiscountPrinted(Boolean discountPrinted) {
        this.discountPrinted = discountPrinted;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public void setPaymentRule(String paymentRule) {
        this.paymentRule = paymentRule;
    }

    public String getPaymentRule() {
        return paymentRule;
    }

    public Integer getPaymentTerm() {
        return paymentTerm;
    }

    public void setPaymentTerm(Integer paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    public Integer getCampaign() {
        return campaign;
    }

    public void setCampaign(Integer campaign) {
        this.campaign = campaign;
    }

    public Integer getTrxOrganization() {
        return trxOrganization;
    }

    public void setTrxOrganization(Integer trxOrganization) {
        this.trxOrganization = trxOrganization;
    }

    public Double getTotalLines() {
        return totalLines;
    }

    public void setTotalLines(Double totalLines) {
        this.totalLines = totalLines;
    }

    public Double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}
