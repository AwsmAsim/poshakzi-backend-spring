package com.poshakzi.poshakzibackend.dto;

import java.util.Objects;

public class CategoryDTO {

    private Long categoryId;
    private String categoryName;
    
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(categoryId, categoryName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoryDTO other = (CategoryDTO) obj;
		return Objects.equals(categoryId, other.categoryId) && Objects.equals(categoryName, other.categoryName);
	}
	@Override
	public String toString() {
		return "CategoryDTO [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	public CategoryDTO(Long categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	public CategoryDTO() {
		super();
	}

	
}

