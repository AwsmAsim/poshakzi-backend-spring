package com.poshakzi.poshakzibackend.dto;

import java.security.Timestamp;
import java.util.Objects;

public class ProductReviewDTO {

    private Long reviewId;
    private ProductDTO product;
    private CustomerDTO customer;
    private Integer rating;
    private String reviewText;
    private Timestamp reviewDate;
	public Long getReviewId() {
		return reviewId;
	}
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
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
		ProductReviewDTO other = (ProductReviewDTO) obj;
		return Objects.equals(customer, other.customer) && Objects.equals(product, other.product)
				&& Objects.equals(rating, other.rating) && Objects.equals(reviewDate, other.reviewDate)
				&& Objects.equals(reviewId, other.reviewId) && Objects.equals(reviewText, other.reviewText);
	}
	@Override
	public String toString() {
		return "ProductReviewDTO [reviewId=" + reviewId + ", product=" + product + ", customer=" + customer
				+ ", rating=" + rating + ", reviewText=" + reviewText + ", reviewDate=" + reviewDate + "]";
	}
	public ProductReviewDTO(Long reviewId, ProductDTO product, CustomerDTO customer, Integer rating, String reviewText,
			Timestamp reviewDate) {
		super();
		this.reviewId = reviewId;
		this.product = product;
		this.customer = customer;
		this.rating = rating;
		this.reviewText = reviewText;
		this.reviewDate = reviewDate;
	}
	public ProductReviewDTO() {
		super();
	}
    
    
    
    

}
