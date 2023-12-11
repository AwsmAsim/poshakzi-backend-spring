package com.poshakzi.poshakzibackend.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.poshakzi.poshakzibackend.dto.ProductDTO;
import com.poshakzi.poshakzibackend.dto.ProductVarientDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", length = 100)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    
    @OneToMany
    @JoinColumn(name = "product_variant_id")
    private List<ProductVarient> productVarients;



	public List<ProductVarient> getProductVarients() {
		return productVarients;
	}

	public void setProductVarients(List<ProductVarient> productVarients) {
		this.productVarients = productVarients;
	}

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	

	public Product() {
		super();
	}

	public Product(Long productId, String productName, Category category, List<ProductVarient> productVarients) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.productVarients = productVarients;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", productVarients=" + productVarients + "]";
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
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(productId, other.productId)
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(productVarients, other.productVarients);
	}


	public ProductDTO toDTO() {
        ProductDTO dto = new ProductDTO();
        dto.setProductId(this.getProductId());
        dto.setProductName(this.getProductName());
        List<ProductVarientDTO> productVarients = new ArrayList<>();
        this.productVarients.forEach(
        	productVarient -> {
        		productVarients.add(productVarient.toDTO());
        	}
        );
        dto.setProductVarients(productVarients);

        // Assuming Category has a categoryId field
        if (this.getCategory() != null) {
            dto.setCategory(this.getCategory().toDTO());
        }

        return dto;
    }
	
}
