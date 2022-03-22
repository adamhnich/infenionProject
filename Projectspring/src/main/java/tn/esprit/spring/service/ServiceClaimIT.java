package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.Type;
import java.util.Date;

public interface ServiceClaimIT {
	 Claim addClaim(Claim c,Long idUser);
	 
//	 void deleteClaim(Long id);
//	void updateClaim(Long idClaim);
//	List<Claim>retreiveClaimUserid(Long idUser);
	 Optional<Claim> retrieveClaims(Long id);
	 List<Claim> retrieveAllClaims();
	  List<Claim> retreiveClaimsByType(Type type);
//	  List<Claim>retreiveClaimByDate(Date date);
	
	  void  setResponsemessage(Long idClaim);

}