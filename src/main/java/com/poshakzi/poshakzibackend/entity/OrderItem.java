package com.poshakzi.poshakzibackend.entity;

import java.math.BigDecimal;
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
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_variant_id")
    private ProductVarient productVariant;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

	@Override
	public int hashCode() {
		return Objects.hash(order, orderItemId, productVariant, quantity, subtotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(order, other.order) && Objects.equals(orderItemId, other.orderItemId)
				&& Objects.equals(productVariant, other.productVariant) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(subtotal, other.subtotal);
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", order=" + order + ", productVariant=" + productVariant
				+ ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
	}

	public OrderItem(Long orderItemId, Order order, ProductVarient productVariant, Integer quantity,
			BigDecimal subtotal) {
		super();
		this.orderItemId = orderItemId;
		this.order = order;
		this.productVariant = productVariant;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public OrderItem() {
		super();
	}

    
}
