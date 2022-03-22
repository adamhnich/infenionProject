package tn.esprit.spring.service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.FrequentClaims;
import tn.esprit.spring.entities.Type;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.exceptions.ResourceNotFoundException;
import tn.esprit.spring.exceptions.GlobalExceptionHandler;
import tn.esprit.spring.repository.ClaimRepository;
import tn.esprit.spring.repository.FreqentlyClaimsRepository;
import tn.esprit.spring.repository.UserRepository;
@Service
public class ServiceClaim  implements ServiceClaimIT{
	@Autowired
	ClaimRepository repo;
	@Autowired
	UserRepository repoUser;
	@Autowired
	ISendEmailService sendemailservice;
	@Autowired
	FreqentlyClaimsRepository repofqClaims;
	@Autowired
	IServiceFqClaims servicefqclaims;

	@Override
	public Claim addClaim(Claim c,Long idUser) {
	
		User user=repoUser.getById(idUser);
	c.setUser(user);
	
	  
		
	
	   sendemailservice.sendSimpleEmail("mohamedamine.benothmane@esprit.tn",  c.getDescription()  ,"reclamation");
	   
		 return repo.save(c);
		
		
		 

	
		
		
	}
	

	

	@Override
	public Optional<Claim> retrieveClaims(Long id) {
	
		return repo.findById(id);
	}

	@Override
	public List<Claim> retrieveAllClaims() {
		List<Claim> claims=  new ArrayList<Claim>();
		repo.findAll().forEach(x-> {
            claims.add(x);
        });
		return claims;
	}

	@Override
	public List<Claim> retreiveClaimsByType(Type type) {
		List<Claim> claims=new ArrayList<Claim>();
		repo.retreiveClaimsByType(type).forEach(x-> {claims.add(x);});
		return  claims;
	}
	
	
	
	@Override
	public void setResponsemessage(Long id){
		 Claim claim=repo.findById(id).orElse(null);
		 
		 String topic=claim.getTopicOfclaim();
		FrequentClaims result= repofqClaims.findByTitle(topic);
		claim.setStatus(true);
		claim.setResponse(result.getSolution());
		repo.save(claim);
		 
		
			
		}



	
	}

//	@Override
//	public List<Claim> retreiveClaimByDate(Date date) {
//		List<Claim> claims=new ArrayList<Claim>();
//		repo.retreiveClaimByDate(date).forEach(x->{claims.add(x);});
//		return null;
//	}
//	
//	 


//	@Override
//	public List<Claim> retreiveClaimUserid(Long idUser) {
//		User user=repoUser.findById(idUser).orElse(null);
//		
//		
//		return (List<Claim>) user.getClaims();
//	}

	


