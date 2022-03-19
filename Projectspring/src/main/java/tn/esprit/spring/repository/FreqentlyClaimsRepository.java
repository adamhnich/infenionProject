package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.FrequentClaims;
@Repository
public interface FreqentlyClaimsRepository  extends JpaRepository<FrequentClaims,Long>{
	FrequentClaims findByTitle(String title);

}
