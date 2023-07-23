package com.ecommerce.customer.dto;

import java.util.Date;


public class OrderDetailDto {
	private Long id;
	private Date quantity;
	private double totalPrice;
	private double unitPrice;
	private String orderId;
	private String productId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getQuantity() {
		return quantity;
	}
	public void setQuantity(Date quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public OrderDetailDto(Long id, Date quantity, double totalPrice, double unitPrice, String orderId,
			String productId) {

		this.id = id;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.unitPrice = unitPrice;
		this.orderId = orderId;
		this.productId = productId;
	}
	public OrderDetailDto() {

	}
	
	

}