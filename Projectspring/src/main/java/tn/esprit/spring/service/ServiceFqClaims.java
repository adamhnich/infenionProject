package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.FrequentClaims;
import tn.esprit.spring.repository.FreqentlyClaimsRepository;
@Service
public class ServiceFqClaims implements IServiceFqClaims {
	@Autowired
	
	FreqentlyClaimsRepository repo;
	
	
	@Override
	public FrequentClaims addfqClaim(FrequentClaims fqClaims) {
		// TODO Auto-generated method stub
		return repo.save(fqClaims);
	}


	@Override
	public FrequentClaims retrievefgByTitle(String title) {
		FrequentClaims xx=repo.findByTitle(title);
		return xx;
	}

}
