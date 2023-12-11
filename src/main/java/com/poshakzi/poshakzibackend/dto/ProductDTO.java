package com.poshakzi.poshakzibackend.dto;

import java.util.List;
import java.util.Objects;

import com.poshakzi.poshakzibackend.entity.ProductVarient;

public class ProductDTO {

    private Long productId;
    private String productName;
    private CategoryDTO category;
    private List<ProductVarientDTO> productVarients;
    
    
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public CategoryDTO getCategory() {
		return category;
	}
	public void setCategory(CategoryDTO category) {
		this.category = category;
	}
	

	
	public List<ProductVarientDTO> getProductVarients() {
		return productVarients;
	}
	public void setProductVarients(List<ProductVarientDTO> productVarients) {
		this.productVarients = productVarients;
	}
	public ProductDTO() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, productId, productName, productVarients);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(category, other.category) && Objects.equals(productId, other.productId)
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productVarients, other.productVarients);
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", productVarients=" + productVarients + "]";
	}
	public ProductDTO(Long productId, String productName, CategoryDTO category,
			List<ProductVarientDTO> productVarients) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.productVarients = productVarients;
	}
	
	
    
    
}
