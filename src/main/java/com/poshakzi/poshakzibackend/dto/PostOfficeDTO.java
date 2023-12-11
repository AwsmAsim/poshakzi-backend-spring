package com.poshakzi.poshakzibackend.dto;

import java.util.List;
import java.util.Objects;

public class PostOfficeDTO {
    private String name;
    private String description;
    private String branchType;
    private String deliveryStatus;
    private String circle;
    private String district;
    private String division;
    private String region;
    private String block;
    private String state;
    private String country;
    private String pincode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(block, branchType, circle, country, deliveryStatus, description, district, division, name,
				pincode, region, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostOfficeDTO other = (PostOfficeDTO) obj;
		return Objects.equals(block, other.block) && Objects.equals(branchType, other.branchType)
				&& Objects.equals(circle, other.circle) && Objects.equals(country, other.country)
				&& Objects.equals(deliveryStatus, other.deliveryStatus)
				&& Objects.equals(description, other.description) && Objects.equals(district, other.district)
				&& Objects.equals(division, other.division) && Objects.equals(name, other.name)
				&& Objects.equals(pincode, other.pincode) && Objects.equals(region, other.region)
				&& Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "PostOfficeDTO [name=" + name + ", description=" + description + ", branchType=" + branchType
				+ ", deliveryStatus=" + deliveryStatus + ", circle=" + circle + ", district=" + district + ", division="
				+ division + ", region=" + region + ", block=" + block + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}

    // Constructors, getters, and setters
    
    

    
}


