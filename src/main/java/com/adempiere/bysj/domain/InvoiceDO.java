package com.adempiere.bysj.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wm on 2018/4/1.
 */
public class InvoiceDO implements Serializable{
    private static final long serialVersionUID = 4120638647741342086L;
    //发票号
    private Integer invoiceId;
    //订单
    private Integer orderId;
    //公司
    private Integer client;
    //部门
    private Integer organization;
    //订单日期
    private Date orderDate;
    //文件编号
    private String documentNo;
    //订单参考
    private String OrderReference;
    //记录描述
    private String description;
    //自助服务
    private String selfService;
    //发票时间
    private Date dateInvoiced;
    //账户时间
    private Date dateAccount;
    //合伙人
    private Integer businessPartner;
    //合伙人地址
    private Integer partnerLocation;
    //内容
    private Integer userOrContact;
    //本金
    private Integer priceList;
    //货币
    private Integer currency;
    //打印
    private String discountPrinted;
    //费用类型
    private Integer charge;
    //费用金额
    private Double chargeAmount;
    //工程
    private Integer project;
    //活动
    private Integer activity;
    //营销计划
    private Integer campaign;
    //中间人
    private Integer trxOrganization;
    //总数
    private Double totalLines;
    //总计
    private Double grandTotal;
    //文件类型
    private Double documentType;
    //分期
    private String payScheduleValid;
    //不清晰
    private String isDispute;
    //
    private String processInvoice;
    //过账
    private String posted;
    //已付费
    private String paid;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public Date getDateInvoiced() {
        return dateInvoiced;
    }

    public void setDateInvoiced(Date dateInvoiced) {
        this.dateInvoiced = dateInvoiced;
    }

    public Date getDateAccount() {
        return dateAccount;
    }

    public void setDateAccount(Date dateAccount) {
        this.dateAccount = dateAccount;
    }

    public Integer getBusinessPartner() {
        return businessPartner;
    }

    public void setBusinessPartner(Integer businessPartner) {
        this.businessPartner = businessPartner;
    }

    public Integer getPartnerLocation() {
        return partnerLocation;
    }

    public void setPartnerLocation(Integer partnerLocation) {
        this.partnerLocation = partnerLocation;
    }

    public Integer getUserOrContact() {
        return userOrContact;
    }

    public void setUserOrContact(Integer userOrContact) {
        this.userOrContact = userOrContact;
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

    public Double getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Double documentType) {
        this.documentType = documentType;
    }

    public String getPayScheduleValid() {
        return payScheduleValid;
    }

    public void setPayScheduleValid(String payScheduleValid) {
        this.payScheduleValid = payScheduleValid;
    }

    public String getIsDispute() {
        return isDispute;
    }

    public void setIsDispute(String isDispute) {
        this.isDispute = isDispute;
    }

    public String getProcessInvoice() {
        return processInvoice;
    }

    public void setProcessInvoice(String processInvoice) {
        this.processInvoice = processInvoice;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getPaid() {
        return paid;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getSelfService() {
        return selfService;
    }

    public void setSelfService(String selfService) {
        this.selfService = selfService;
    }

    public String getDiscountPrinted() {
        return discountPrinted;
    }

    public void setDiscountPrinted(String discountPrinted) {
        this.discountPrinted = discountPrinted;
    }
}
