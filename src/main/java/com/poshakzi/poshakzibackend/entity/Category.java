package com.poshakzi.poshakzibackend.entity;

import java.util.Objects;

import com.poshakzi.poshakzibackend.dto.CategoryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_name", unique = true, length = 50)
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
		Category other = (Category) obj;
		return Objects.equals(categoryId, other.categoryId) && Objects.equals(categoryName, other.categoryName);
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

	public CategoryDTO toDTO() {
		
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setCategoryId(this.categoryId);
		categoryDTO.setCategoryName(this.categoryName);
		
		return categoryDTO;
		
	}

	
}
