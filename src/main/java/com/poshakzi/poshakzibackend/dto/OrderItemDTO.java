package com.poshakzi.poshakzibackend.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class OrderItemDTO {

    private Long orderItemId;
    private OrderDTO order;
    private ProductVarientDTO productVariant;
    private Integer quantity;
    private BigDecimal subtotal;
	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public OrderDTO getOrder() {
		return order;
	}
	public void setOrder(OrderDTO order) {
		this.order = order;
	}
	public ProductVarientDTO getProductVariant() {
		return productVariant;
	}
	public void setProductVariant(ProductVarientDTO productVariant) {
		this.productVariant = productVariant;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(order, orderItemId, quantity, subtotal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemDTO other = (OrderItemDTO) obj;
		return Objects.equals(order, other.order) && Objects.equals(orderItemId, other.orderItemId)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(subtotal, other.subtotal);
	}
	@Override
	public String toString() {
		return "OrderItemDTO [orderItemId=" + orderItemId + ", order=" + order + ", quantity=" + quantity
				+ ", subtotal=" + subtotal + "]";
	}
	public OrderItemDTO() {
		super();
	}

    
    
    
}
