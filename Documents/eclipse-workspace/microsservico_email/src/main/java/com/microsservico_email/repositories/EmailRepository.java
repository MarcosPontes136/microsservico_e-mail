package com.microsservico_email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservico_email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID>{

}
