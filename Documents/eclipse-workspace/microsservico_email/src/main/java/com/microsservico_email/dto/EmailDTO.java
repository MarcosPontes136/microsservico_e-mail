package com.microsservico_email.dto;

import org.springframework.beans.factory.annotation.Value;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDTO {
	
	private Long emailId;
	
	
	private String fromName;
	
	@Email
	private String fromEmail;
	
//	@Email
//	private String emailTo;
	
	@NotBlank
	private String subject;
	
	@NotBlank
	private String text;

	public Long getEmailId() {
		return emailId;
	}
	
}
