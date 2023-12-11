package com.poshakzi.poshakzibackend.dto;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Objects;

public class OrderDTO {

    private Long orderId;
    private CustomerDTO customer;
    private AddressDTO address;
    private Timestamp orderDate;
    private BigDecimal totalAmount;
    private String status;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customer, orderDate, orderId, status, totalAmount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(customer, other.customer)
				&& Objects.equals(orderDate, other.orderDate) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(status, other.status) && Objects.equals(totalAmount, other.totalAmount);
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", customer=" + customer + ", address=" + address + ", orderDate="
				+ orderDate + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}
	public OrderDTO(Long orderId, CustomerDTO customer, AddressDTO address, Timestamp orderDate, BigDecimal totalAmount,
			String status) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.address = address;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
	}
	public OrderDTO() {
		super();
	}

	
	
    
}

