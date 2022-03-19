package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

import tn.esprit.spring.entities.Claim;

import tn.esprit.spring.entities.Type;
@Repository
public interface ClaimRepository extends JpaRepository <Claim,Long>{
 @Query("SELECT c FROM Claim c WHERE c.type=:type")
 List<Claim> retreiveClaimsByType(@Param("type")Type type);
// @Query("Select c FROM Claim c WHERE  c.dateClaim >?1")
// List<Claim>  retreiveClaimByDate(@Param("dateClaim")Date date);
// 
// 
} 



