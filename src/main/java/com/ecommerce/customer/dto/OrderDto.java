package com.ecommerce.customer.dto;

import java.util.Date;
import java.util.List;

import com.ecommerce.customer.model.Customer;
import com.ecommerce.customer.model.OrderDetail;


import javax.persistence.Column;


public class OrderDto {
	private Long id;
	private Date orderDate;
	private Date deliveryDate;
	@Column(name = "total_price")
	private double totalPrice;
	@Column(name = "shipping_fee")
	private double shippingFee;
	private String orderStatus;
	private String notes;
	private Customer customer;
	private List<OrderDetail> orderDetailList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(double shippingFee) {
		this.shippingFee = shippingFee;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	public OrderDto(Long id, Date orderDate, Date deliveryDate, double totalPrice, double shippingFee,
			String orderStatus, String notes, Customer customer, List<OrderDetail> orderDetailList) {

		this.id = id;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.totalPrice = totalPrice;
		this.shippingFee = shippingFee;
		this.orderStatus = orderStatus;
		this.notes = notes;
		this.customer = customer;
		this.orderDetailList = orderDetailList;
	}
	public OrderDto() {
	
	}
	
	
	

}
