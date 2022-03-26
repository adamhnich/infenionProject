package tn.esprit.spring.services;

public interface ISendEmailService {
	void sendSimpleEmail( String toEmail,
            String body,
            String subject);


}
