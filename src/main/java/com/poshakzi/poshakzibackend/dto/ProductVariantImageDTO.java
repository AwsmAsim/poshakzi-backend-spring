package com.poshakzi.poshakzibackend.dto;

import java.util.Objects;

import com.poshakzi.poshakzibackend.entity.ProductVariantImage;

public class ProductVariantImageDTO {

	private Long productVariantImagesId;

    private String productImageLink;
    
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

	@Override
	public int hashCode() {
		return Objects.hash(productImageLink,  productVariantImagesId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVariantImageDTO other = (ProductVariantImageDTO) obj;
		return Objects.equals(productImageLink, other.productImageLink)
				&& Objects.equals(productVariantImagesId, other.productVariantImagesId);
	}

	public ProductVariantImageDTO(Long productVariantImagesId, String productImageLink, Long productVariantId) {
		super();
		this.productVariantImagesId = productVariantImagesId;
		this.productImageLink = productImageLink;
	}

    
    public ProductVariantImageDTO() {
    	super();
    }
    
    public ProductVariantImage toEntity() {
    	ProductVariantImage productVariantImage = new ProductVariantImage();
    	
    	productVariantImage.setProductImageLink(productImageLink);
    	productVariantImage.setProductVariantImagesId(productVariantImagesId);
    	
    	return productVariantImage;
    }
}
