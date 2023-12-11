package com.poshakzi.poshakzibackend.dto;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Objects;

public class PaymentDTO {

    private Long paymentId;
    private OrderDTO order;
    private Timestamp paymentDate;
    private BigDecimal paymentAmount;
    private String paymentMethod;
    private String status;
	public Long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}
	public OrderDTO getOrder() {
		return order;
	}
	public void setOrder(OrderDTO order) {
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
		PaymentDTO other = (PaymentDTO) obj;
		return Objects.equals(order, other.order) && Objects.equals(paymentAmount, other.paymentAmount)
				&& Objects.equals(paymentDate, other.paymentDate) && Objects.equals(paymentId, other.paymentId)
				&& Objects.equals(paymentMethod, other.paymentMethod) && Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "PaymentDTO [paymentId=" + paymentId + ", order=" + order + ", paymentDate=" + paymentDate
				+ ", paymentAmount=" + paymentAmount + ", paymentMethod=" + paymentMethod + ", status=" + status + "]";
	}
	public PaymentDTO(Long paymentId, OrderDTO order, Timestamp paymentDate, BigDecimal paymentAmount,
			String paymentMethod, String status) {
		super();
		this.paymentId = paymentId;
		this.order = order;
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.paymentMethod = paymentMethod;
		this.status = status;
	}
	public PaymentDTO() {
		super();
	}

    
    
}
