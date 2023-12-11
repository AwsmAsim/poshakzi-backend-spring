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
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Column(name = "payment_amount", precision = 10, scale = 2)
    private BigDecimal paymentAmount;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "status", length = 20)
    private String status;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Timestamp getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", order=" + order + ", paymentDate=" + paymentDate
				+ ", paymentAmount=" + paymentAmount + ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, paymentAmount, paymentDate, paymentId, paymentMethod, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(order, other.order) && Objects.equals(paymentAmount, other.paymentAmount)
				&& Objects.equals(paymentDate, other.paymentDate) && Objects.equals(paymentId, other.paymentId)
				&& Objects.equals(paymentMethod, other.paymentMethod) && Objects.equals(status, other.status);
	}

	public Payment(Long paymentId, Order order, Timestamp paymentDate, BigDecimal paymentAmount, String paymentMethod,
			String status) {
		super();
		this.paymentId = paymentId;
		this.order = order;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.paymentMethod = paymentMethod;
		this.status = status;
	}

	public Payment() {
		super();
	}

	
}
