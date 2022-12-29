package com.example.mongoPc1.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private long PhoneNo;
    private Product customerProduct;
    public Customer(){

    }

    public Customer(int customerId, String customerName, long phoneNo, Product customerProduct) {
        this.customerId = customerId;
        this.customerName = customerName;
        PhoneNo = phoneNo;
        this.customerProduct = customerProduct;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        PhoneNo = phoneNo;
    }

    public Product getCustomerProduct() {
        return customerProduct;
    }

    public void setCustomerProduct(Product customerProduct) {
        this.customerProduct = customerProduct;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", customerProduct=" + customerProduct +
                '}';
    }
}
