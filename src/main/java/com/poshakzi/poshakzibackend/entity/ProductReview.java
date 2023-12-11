package com.poshakzi.poshakzibackend.entity;

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
@Table(name = "product_reviews")
public class ProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "review_text", columnDefinition = "TEXT")
    private String reviewText;

    @Column(name = "review_date")
    private Timestamp reviewDate;

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Timestamp getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Timestamp reviewDate) {
		this.reviewDate = reviewDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer, product, rating, reviewDate, reviewId, reviewText);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductReview other = (ProductReview) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(product, other.product)
				&& Objects.equals(rating, other.rating) && Objects.equals(reviewDate, other.reviewDate)
				&& Objects.equals(reviewId, other.reviewId) && Objects.equals(reviewText, other.reviewText);
	}

	@Override
	public String toString() {
		return "ProductReview [reviewId=" + reviewId + ", product=" + product + ", customer=" + customer + ", rating="
				+ rating + ", reviewText=" + reviewText + ", reviewDate=" + reviewDate + "]";
	}

	public ProductReview(Long reviewId, Product product, Customer customer, Integer rating, String reviewText,
			Timestamp reviewDate) {
		super();
		this.reviewId = reviewId;
		this.product = product;
		this.customer = customer;
		this.rating = rating;
		this.reviewText = reviewText;
		this.reviewDate = reviewDate;
	}

	public ProductReview() {
		super();
	}

    
}
