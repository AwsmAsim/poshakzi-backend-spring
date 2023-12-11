package com.poshakzi.poshakzibackend.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import com.poshakzi.poshakzibackend.entity.ProductVariantImage;

public class ProductVarientDTO {

    public ProductVarientDTO() {
		super();
	}
	
    
    
	public ProductVarientDTO(Long productVariantId, String productVariantName, String productVariantImage,
			BigDecimal originalPrice, BigDecimal price, String sizeChart, String shortDescription, String description,
			List<SizesAvailableDTO> sizesAvailableDTOList) {
		super();
		this.productVariantId = productVariantId;
		this.productVariantName = productVariantName;
		this.productVariantImage = productVariantImage;
		this.originalPrice = originalPrice;
		this.price = price;
		this.sizeChart = sizeChart;
		this.shortDescription = shortDescription;
		this.description = description;
		this.sizesAvailableList = sizesAvailableDTOList;
	}



	private Long productVariantId;
    private String productVariantName;
    private String productVariantImage;
    private BigDecimal originalPrice;
    private BigDecimal price;
    private String sizeChart;
    private String shortDescription;
    private String description;
    private List<SizesAvailableDTO> sizesAvailableList;
    private List<ProductVariantImageDTO> productVarientImageList;

    
    
    
	



	public List<SizesAvailableDTO> getSizesAvailableList() {
		return sizesAvailableList;
	}



	public void setSizesAvailableList(List<SizesAvailableDTO> sizesAvailableList) {
		this.sizesAvailableList = sizesAvailableList;
	}



	public List<ProductVariantImageDTO> getProductVarientImageList() {
		return productVarientImageList;
	}



	public void setProductVarientImageList(List<ProductVariantImageDTO> productVarientImageList) {
		this.productVarientImageList = productVarientImageList;
	}



	public List<SizesAvailableDTO> getSizesAvailableDTOList() {
		return sizesAvailableList;
	}



	public void setSizesAvailableDTOList(List<SizesAvailableDTO> sizesAvailableDTOList) {
		this.sizesAvailableList = sizesAvailableDTOList;
	}



	public Long getProductVariantId() {
		return productVariantId;
	}
	public void setProductVariantId(Long productVariantId) {
		this.productVariantId = productVariantId;
	}
	public String getProductVariantName() {
		return productVariantName;
	}
	public void setProductVariantName(String productVariantName) {
		this.productVariantName = productVariantName;
	}
	public String getProductVariantImage() {
		return productVariantImage;
	}
	public void setProductVariantImage(String productVariantImage) {
		this.productVariantImage = productVariantImage;
	}
	public BigDecimal getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getSizeChart() {
		return sizeChart;
	}
	public void setSizeChart(String sizeChart) {
		this.sizeChart = sizeChart;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public int hashCode() {
		return Objects.hash(description, originalPrice, price, productVariantId, productVariantImage,
				productVariantName, productVarientImageList, shortDescription, sizeChart, sizesAvailableList);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVarientDTO other = (ProductVarientDTO) obj;
		return Objects.equals(description, other.description) && Objects.equals(originalPrice, other.originalPrice)
				&& Objects.equals(price, other.price) && Objects.equals(productVariantId, other.productVariantId)
				&& Objects.equals(productVariantImage, other.productVariantImage)
				&& Objects.equals(productVariantName, other.productVariantName)
				&& Objects.equals(productVarientImageList, other.productVarientImageList)
				&& Objects.equals(shortDescription, other.shortDescription)
				&& Objects.equals(sizeChart, other.sizeChart)
				&& Objects.equals(sizesAvailableList, other.sizesAvailableList);
	}



	@Override
	public String toString() {
		return "ProductVarientDTO [productVariantId=" + productVariantId + ", productVariantName=" + productVariantName
				+ ", productVariantImage=" + productVariantImage + ", originalPrice=" + originalPrice + ", price="
				+ price + ", sizeChart=" + sizeChart + ", shortDescription=" + shortDescription + ", description="
				+ description + ", sizesAvailableList=" + sizesAvailableList + ", productVarientImageList="
				+ productVarientImageList + "]";
	}



	
	
	
    
	
    
    
}
