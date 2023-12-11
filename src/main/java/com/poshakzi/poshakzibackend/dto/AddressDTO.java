package com.poshakzi.poshakzibackend.dto;

import java.util.Objects;

public class AddressDTO {

    private Long addressId;
    private String country;
    private Integer pincode;
    private String addressLine1;
    private String addressLine2;
    private String landmarkNearBy;
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getLandmarkNearBy() {
		return landmarkNearBy;
	}
	public void setLandmarkNearBy(String landmarkNearBy) {
		this.landmarkNearBy = landmarkNearBy;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressId, addressLine1, addressLine2, country, landmarkNearBy, pincode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressDTO other = (AddressDTO) obj;
		return Objects.equals(addressId, other.addressId) && Objects.equals(addressLine1, other.addressLine1)
				&& Objects.equals(addressLine2, other.addressLine2) && Objects.equals(country, other.country)
				&& Objects.equals(landmarkNearBy, other.landmarkNearBy) && Objects.equals(pincode, other.pincode);
	}
	@Override
	public String toString() {
		return "AddressDTO [addressId=" + addressId + ", country=" + country + ", pincode=" + pincode
				+ ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", landmarkNearBy="
				+ landmarkNearBy + "]";
	}
	public AddressDTO(Long addressId, String country, Integer pincode, String addressLine1, String addressLine2,
			String landmarkNearBy) {
		super();
		this.addressId = addressId;
		this.country = country;
		this.pincode = pincode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.landmarkNearBy = landmarkNearBy;
	}
	public AddressDTO() {
		super();
	}

    
}
