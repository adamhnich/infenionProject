package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.Type;
import java.util.Date;

public interface ServiceClaimIT {
	 Claim addClaim(Claim c,Long idUser);
	 
	 void deleteClaim(Long id);
	 Claim updateClaim(Claim c,Long idUser);
//	List<Claim>retreiveClaimUserid(Long idUser);
	 Claim retrieveClaims(Long id);
	 List<Claim> retrieveAllClaims();
	  List<Claim> retreiveClaimsByType(Type type);
	  List<Claim>retreiveClaimByDate(Date date);

}