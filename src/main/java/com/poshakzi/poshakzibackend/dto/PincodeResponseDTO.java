package com.poshakzi.poshakzibackend.dto;

import java.util.List;
import java.util.Objects;

public class PincodeResponseDTO {
    private String message;
    private String status;
    private List<PostOfficeDTO> postOffice;

    // Constructors, getters, and setters

    
    
    @Override
    public String toString() {
        StringBuilder postOfficeStr = new StringBuilder();
        for (PostOfficeDTO po : postOffice) {
            postOfficeStr.append(po.toString()).append(", ");
        }

        return String.format("%s: %s\nPost Offices: %s", status, message, postOfficeStr.toString());
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PostOfficeDTO> getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(List<PostOfficeDTO> postOffice) {
		this.postOffice = postOffice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, postOffice, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PincodeResponseDTO other = (PincodeResponseDTO) obj;
		return Objects.equals(message, other.message) && Objects.equals(postOffice, other.postOffice)
				&& Objects.equals(status, other.status);
	}
	
	
}
