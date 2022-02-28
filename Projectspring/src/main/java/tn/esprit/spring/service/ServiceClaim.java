package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.Type;
import tn.esprit.spring.repository.ClaimRepository;
@Service
public class ServiceClaim  implements ServiceClaimIT{
	@Autowired
	ClaimRepository repo;

	@Override
	public Claim addClaim(Claim c) {
	     
		return repo.save(c);
	}

	@Override
	public void deleteClaim(Long id) {
		 repo.deleteById(id);	  
		
	}

	@Override
	public Claim updateClaim(Claim c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Claim retrieveClaims(Long id) {
		Claim c=repo.findById(id).orElse(null);
		return c;
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
	public List<Claim> retreiveClaimByDate(Date date) {
		List<Claim> claims=new ArrayList<Claim>();
		repo.retreiveClaimByDate(date).forEach(x->{claims.add(x);});
		return null;
	}

}
