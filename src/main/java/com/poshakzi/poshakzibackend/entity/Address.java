package com.poshakzi.poshakzibackend.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "country", length = 32, columnDefinition = "VARCHAR(32) DEFAULT 'INDIA'")
    private String country;

    @Column(name = "pincode", nullable = false)
    private Integer pincode;

    @Column(name = "address_line_1", nullable = false, length = 300)
    private String addressLine1;

    @Column(name = "address_line_2", length = 300)
    private String addressLine2;

    @Column(name = "landmark_near_by", length = 300)
    private String landmarkNearBy;

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", country=" + country + ", pincode=" + pincode + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", landmarkNearBy=" + landmarkNearBy + "]";
	}

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
		Address other = (Address) obj;
		return Objects.equals(addressId, other.addressId) && Objects.equals(addressLine1, other.addressLine1)
				&& Objects.equals(addressLine2, other.addressLine2) && Objects.equals(country, other.country)
				&& Objects.equals(landmarkNearBy, other.landmarkNearBy) && Objects.equals(pincode, other.pincode);
	}

    // Getters and setters
}

