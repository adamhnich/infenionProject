package tn.esprit.spring.service;

import tn.esprit.spring.entities.FrequentClaims;

public interface IServiceFqClaims {
	 FrequentClaims  addfqClaim( FrequentClaims fqClaims);
	 FrequentClaims retrievefgByTitle(String tiltle);

}
