package com.poshakzi.poshakzibackend.entity;

import java.util.Objects;

import com.poshakzi.poshakzibackend.dto.ProductVariantImageDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_varient_images")
public class ProductVariantImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_varient_images_id")
    private Long productVariantImagesId;

    @Column(name = "product_image_link", length = 200)
    private String productImageLink;


    @ManyToOne
    @JoinColumn(name = "product_variant_id", referencedColumnName = "product_variant_id", insertable = false, updatable = false)
    private ProductVarient productVariant;

	public Long getProductVariantImagesId() {
		return productVariantImagesId;
	}

	public void setProductVariantImagesId(Long productVariantImagesId) {
		this.productVariantImagesId = productVariantImagesId;
	}

	public String getProductImageLink() {
		return productImageLink;
	}

	public void setProductImageLink(String productImageLink) {
		this.productImageLink = productImageLink;
	}


	public ProductVarient getProductVariant() {
		return productVariant;
	}

	public void setProductVariant(ProductVarient productVariant) {
		this.productVariant = productVariant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productImageLink, productVariant, productVariantImagesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVariantImage other = (ProductVariantImage) obj;
		return Objects.equals(productImageLink, other.productImageLink)
				&& Objects.equals(productVariant, other.productVariant)
				&& Objects.equals(productVariantImagesId, other.productVariantImagesId);
	}

	@Override
	public String toString() {
		return "ProductVariantImage [productVariantImagesId=" + productVariantImagesId + ", productImageLink="
				+ productImageLink +  ", productVariant=" + productVariant
				+ "]";
	}

	public ProductVariantImage(Long productVariantImagesId, String productImageLink, Long productVariantId,
			ProductVarient productVariant) {
		super();
		this.productVariantImagesId = productVariantImagesId;
		this.productImageLink = productImageLink;
		this.productVariant = productVariant;
	}

	public ProductVariantImage() {
		super();
	}

	public ProductVariantImageDTO toDTO() {
    	ProductVariantImageDTO productVariantImageDTO = new ProductVariantImageDTO();
    	
    	productVariantImageDTO.setProductImageLink(productImageLink);
    	productVariantImageDTO.setProductVariantImagesId(productVariantImagesId);
    	
    	return productVariantImageDTO;
    }
    
}
