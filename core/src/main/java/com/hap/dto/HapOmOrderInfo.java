package com.hap.dto;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by TandTV on 2017/1/13.
 */

public class HapOmOrderInfo{

    private Long headerId;

    private Long lineId;

    private String orderNumber;

    private String companyName;

    private Long customerId;

    private String customerName;

    private Long companyId;

    private Date orderDate;

    private String orderStatus;

    private Long inventoryItemId;

    private String itemCode;

    private String itemDescription;

    private Integer orderMoney;

    public HapOmOrderInfo() {
    }

    public HapOmOrderInfo(String orderNumber, Long customerId, Long companyId, String orderStatus, Long inventoryItemId) {
        this.orderNumber = orderNumber;
        this.customerId = customerId;
        this.companyId = companyId;
        this.orderStatus = orderStatus;
        this.inventoryItemId = inventoryItemId;
    }

    public int getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Integer orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}
