package com.poshakzi.poshakzibackend.entity;

import java.util.Objects;

import com.poshakzi.poshakzibackend.dto.SizesAvailableDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sizes_available")
public class SizesAvailable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sizes_available_id")
    private Long sizesAvailableId;

    @Column(name = "size_name", nullable = false, length = 10)
    private String sizeName;

    @Column(name = "quantity_available", columnDefinition = "INT DEFAULT 0")
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

	

	public SizesAvailable(Long sizesAvailableId, String sizeName, Integer quantityAvailable) {
		super();
		this.sizesAvailableId = sizesAvailableId;
		this.sizeName = sizeName;
		this.quantityAvailable = quantityAvailable;
	}

	@Override
	public String toString() {
		return "SizesAvailable [sizesAvailableId=" + sizesAvailableId + ", sizeName=" + sizeName
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
		SizesAvailable other = (SizesAvailable) obj;
		return Objects.equals(quantityAvailable, other.quantityAvailable) && Objects.equals(sizeName, other.sizeName)
				&& Objects.equals(sizesAvailableId, other.sizesAvailableId);
	}

	public SizesAvailable() {
		super();
	}

 
	public SizesAvailableDTO toDTO() {
		SizesAvailableDTO sizesAvailableDTO = new SizesAvailableDTO();
		
		sizesAvailableDTO.setQuantityAvailable(quantityAvailable);
		sizesAvailableDTO.setSizeName(sizeName);
		sizesAvailableDTO.setSizesAvailableId(sizesAvailableId);
		
		return sizesAvailableDTO;
	}

}


