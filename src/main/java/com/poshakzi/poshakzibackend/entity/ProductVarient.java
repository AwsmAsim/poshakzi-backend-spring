package com.poshakzi.poshakzibackend.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.poshakzi.poshakzibackend.dto.ProductVariantImageDTO;
import com.poshakzi.poshakzibackend.dto.ProductVarientDTO;
import com.poshakzi.poshakzibackend.dto.SizesAvailableDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_variants")
public class ProductVarient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_variant_id")
    private Long productVariantId;

    @Column(name = "product_variant_name", nullable = false, length = 100)
    private String productVariantName;

    @Column(name = "product_variant_image", length = 100)
    private String productVariantImage;

    @Column(name = "original_price", precision = 10, scale = 2)
    private BigDecimal originalPrice;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "size_chart", length = 300)
    private String sizeChart;

    @Column(name = "short_description", length = 300)
    private String shortDescription;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    
    @OneToMany
    @JoinColumn(name = "product_variant_id")
    private List<SizesAvailable> sizesAvailableList;
    
    @OneToMany
    @JoinColumn(name = "product_variant_id")
    private List<ProductVariantImage> productVarientImageList;

    
    
    
	public ProductVarient(Long productVariantId, String productVariantName, String productVariantImage,
			BigDecimal originalPrice, BigDecimal price, String sizeChart, String shortDescription, String description,
			List<SizesAvailable> sizesAvailableList, List<ProductVariantImage> productVarientImageList) {
		super();
		this.productVariantId = productVariantId;
		this.productVariantName = productVariantName;
		this.productVariantImage = productVariantImage;
		this.originalPrice = originalPrice;
		this.price = price;
		this.sizeChart = sizeChart;
		this.shortDescription = shortDescription;
		this.description = description;
		this.sizesAvailableList = sizesAvailableList;
		this.productVarientImageList = productVarientImageList;
	}

	public List<ProductVariantImage> getProductVarientImageList() {
		return productVarientImageList;
	}

	public void setProductVarientImageList(List<ProductVariantImage> productVarientImageList) {
		this.productVarientImageList = productVarientImageList;
	}

	public List<SizesAvailable> getSizesAvailableList() {
		return sizesAvailableList;
	}

	public void setSizesAvailableList(List<SizesAvailable> sizesAvailableList) {
		this.sizesAvailableList = sizesAvailableList;
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



	

	
	public ProductVarient() {
		super();
	}

	public ProductVarient(Long productVariantId, String productVariantName, String productVariantImage,
			BigDecimal originalPrice, BigDecimal price, String sizeChart, String shortDescription, String description,
			List<SizesAvailable> sizesAvailableList) {
		super();
		this.productVariantId = productVariantId;
		this.productVariantName = productVariantName;
		this.productVariantImage = productVariantImage;
		this.originalPrice = originalPrice;
		this.price = price;
		this.sizeChart = sizeChart;
		this.shortDescription = shortDescription;
		this.description = description;
		this.sizesAvailableList = sizesAvailableList;
	}

	@Override
	public String toString() {
		return "ProductVarient [productVariantId=" + productVariantId + ", productVariantName=" + productVariantName
				+ ", productVariantImage=" + productVariantImage + ", originalPrice=" + originalPrice + ", price="
				+ price + ", sizeChart=" + sizeChart + ", shortDescription=" + shortDescription + ", description="
				+ description + ", sizesAvailableList=" + sizesAvailableList + ", productVarientImageList="
				+ productVarientImageList + "]";
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
		ProductVarient other = (ProductVarient) obj;
		return Objects.equals(description, other.description) && Objects.equals(originalPrice, other.originalPrice)
				&& Objects.equals(price, other.price) && Objects.equals(productVariantId, other.productVariantId)
				&& Objects.equals(productVariantImage, other.productVariantImage)
				&& Objects.equals(productVariantName, other.productVariantName)
				&& Objects.equals(productVarientImageList, other.productVarientImageList)
				&& Objects.equals(shortDescription, other.shortDescription)
				&& Objects.equals(sizeChart, other.sizeChart)
				&& Objects.equals(sizesAvailableList, other.sizesAvailableList);
	}

	public ProductVarientDTO toDTO() {
        ProductVarientDTO dto = new ProductVarientDTO();
        dto.setProductVariantId(this.getProductVariantId());
        dto.setProductVariantName(this.getProductVariantName());
        dto.setProductVariantImage(this.getProductVariantImage());
        dto.setOriginalPrice(this.getOriginalPrice());
        dto.setPrice(this.getPrice());
        dto.setSizeChart(this.getSizeChart());
        dto.setShortDescription(this.getShortDescription());
        dto.setDescription(this.getDescription());
        
        List<SizesAvailableDTO> sizeAvailableDTOList = new ArrayList<>();
        
        for(SizesAvailable sizesAvailable: sizesAvailableList) {
        	sizeAvailableDTOList.add(sizesAvailable.toDTO());
        }
        
        dto.setSizesAvailableDTOList(sizeAvailableDTOList);
        
        
        List<ProductVariantImageDTO> imageDTOs = new ArrayList<>();
        for(ProductVariantImage imageDTO: productVarientImageList) {
        	imageDTOs.add(imageDTO.toDTO());
        }

        dto.setProductVarientImageList(imageDTOs);
        
        return dto;
    }
    
}

