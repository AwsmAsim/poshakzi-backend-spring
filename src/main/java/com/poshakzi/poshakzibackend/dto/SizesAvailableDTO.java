package com.poshakzi.poshakzibackend.dto;

import java.util.Objects;

import com.poshakzi.poshakzibackend.entity.SizesAvailable;

import com.poshakzi.poshakzibackend.entity.SizesAvailable;

public class SizesAvailableDTO {

    private Long sizesAvailableId;
    private String sizeName;
    private Integer quantityAvailable;
	public Long getSizesAvailableId() {
		return sizesAvailableId;
	}
	public void setSizesAvailableId(Long sizesAvailableId) {
		this.sizesAvailableId = sizesAvailableId;
	}
	public String getSizeName() {
		return sizeName;
	}
	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
	}
	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	
	
	
	public SizesAvailableDTO(Long sizesAvailableId, String sizeName, Integer quantityAvailable) {
		super();
		this.sizesAvailableId = sizesAvailableId;
		this.sizeName = sizeName;
		this.quantityAvailable = quantityAvailable;
	}
	@Override
	public String toString() {
		return "SizesAvailableDTO [sizesAvailableId=" + sizesAvailableId + ", sizeName=" + sizeName
				+ ", quantityAvailable=" + quantityAvailable + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(quantityAvailable, sizeName, sizesAvailableId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SizesAvailableDTO other = (SizesAvailableDTO) obj;
		return Objects.equals(quantityAvailable, other.quantityAvailable) && Objects.equals(sizeName, other.sizeName)
				&& Objects.equals(sizesAvailableId, other.sizesAvailableId);
	}
	public SizesAvailableDTO() {
		super();
	}
	
	public SizesAvailable toEntity() {
		SizesAvailable sizesAvailable = new SizesAvailable();
		
		sizesAvailable.setQuantityAvailable(quantityAvailable);
		sizesAvailable.setSizeName(sizeName);
		sizesAvailable.setSizesAvailableId(sizesAvailableId);
		
		return sizesAvailable;
	}
    
    
    
}
