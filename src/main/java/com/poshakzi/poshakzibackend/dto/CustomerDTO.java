package com.poshakzi.poshakzibackend.dto;

import java.util.Objects;

public class CustomerDTO {

    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private AddressDTO address;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, email, firstName, lastName, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		return Objects.equals(address, other.address) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(phoneNumber, other.phoneNumber);
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	public CustomerDTO(Long customerId, String firstName, String lastName, String email, String phoneNumber,
			AddressDTO address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public CustomerDTO() {
		super();
	}

    
}
