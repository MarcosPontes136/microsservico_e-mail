package com.microsservico_email.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.microsservico_email.Service.EmailService;
import com.microsservico_email.dto.EmailDTO;
import com.microsservico_email.models.EmailModel;


@Component
public class EmailConsumers {
	
	@Autowired
	EmailService emailService;
	
	@RabbitListener(queues = "${spring.rabbitmq.queue}")
	public void listen(@Payload EmailDTO emailDTO) {
		EmailModel emailModel = new EmailModel();
		BeanUtils.copyProperties(emailDTO, emailModel);
		emailService.sendEmail(emailModel);
		System.out.println("Email Status " + emailModel.getStatusEmail().toString());
	}

}
