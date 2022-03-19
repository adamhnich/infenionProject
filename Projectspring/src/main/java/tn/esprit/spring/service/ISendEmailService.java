package tn.esprit.spring.service;

public interface ISendEmailService {
	void sendSimpleEmail( String toEmail,
            String body,
            String subject);


}
