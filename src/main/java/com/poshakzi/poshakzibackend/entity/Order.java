package com.poshakzi.poshakzibackend.entity;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "order_date")
    private Timestamp orderDate;

    @Column(name = "total_amount", precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "status", length = 20)
    private String status;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
		Order other = (Order) obj;
		return Objects.equals(address, other.address) && Objects.equals(customer, other.customer)
				&& Objects.equals(orderDate, other.orderDate) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(status, other.status) && Objects.equals(totalAmount, other.totalAmount);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", address=" + address + ", orderDate="
				+ orderDate + ", totalAmount=" + totalAmount + ", status=" + status + "]";
	}

	public Order(Long orderId, Customer customer, Address address, Timestamp orderDate, BigDecimal totalAmount,
			String status) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.address = address;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
		this.status = status;
	}

	public Order() {
		super();
	}

	
    
}
