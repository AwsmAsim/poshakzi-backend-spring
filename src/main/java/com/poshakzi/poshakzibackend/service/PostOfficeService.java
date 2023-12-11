package com.poshakzi.poshakzibackend.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.poshakzi.poshakzibackend.dto.PincodeResponseDTO;
import com.poshakzi.poshakzibackend.dto.PostOfficeDTO;
import com.poshakzi.poshakzibackend.exception.NoDataFoundException;

@Service
public class PostOfficeService {
	
	
	public PostOfficeDTO getDetails(List<PostOfficeDTO> postOffices) throws NoDataFoundException{
		
		for(PostOfficeDTO postOffice : postOffices) {
			if(postOffice.equals("Delivery") || postOffice.equals("delivery")) {
				return postOffice;
			}
		}
		
		throw new NoDataFoundException("No deliverable Post Office");
		
	}
	
	public PostOfficeDTO getDetailsFromResponse(List<PincodeResponseDTO> pincodeResponses) throws NoDataFoundException{
		
		PincodeResponseDTO reliableResponse = null;
		
		// Searching for reliable response
		System.out.println("Searching for reliable response");
		for(PincodeResponseDTO response: pincodeResponses) {
			System.out.println(getNumberFromMessage(response.getMessage()) > 0);
			if(getNumberFromMessage(response.getMessage()) > 0) {
				reliableResponse = response;
				break;
			}
		}
		
		if(reliableResponse == null) new NoDataFoundException("No Reliable reponse. This have happend due to the number of pincode retrieved is 0");
		
		
		// Searching for data from a deliverable address
		System.out.println("Searching for data from deliverable address");
		for(PostOfficeDTO postOfficeDTO: reliableResponse.getPostOffice()) {
			if(postOfficeDTO.getDeliveryStatus().equals("Delivery") && 
					postOfficeDTO.getState() != null && (!postOfficeDTO.getState().isEmpty()) &&
					postOfficeDTO.getRegion() != null && (!postOfficeDTO.getRegion().isEmpty())
			) {
				return postOfficeDTO;
			}
		}
		
		
		// Searching for data from non deliverable address because the address doesn't have any yet
		System.out.println("from non deliverable address ");
		for(PostOfficeDTO postOfficeDTO: reliableResponse.getPostOffice()) {
			if(postOfficeDTO.getState() != null && (!postOfficeDTO.getState().isEmpty()) &&
					postOfficeDTO.getRegion() != null && (!postOfficeDTO.getRegion().isEmpty())) {
				return postOfficeDTO;
			}
		}
		
		throw new NoDataFoundException("No deliverable Post Office");
		
    }
	
	private Integer getNumberFromMessage(String message) {
		String input = "Number of pincode(s) found:2";
        
        // Using regular expressions
        String pattern = "\\d+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);

        if (m.find()) {
            String numberStr = m.group();
            int number = Integer.parseInt(numberStr);
            return number;
        } else {
            return 0;
        }
	}

}
