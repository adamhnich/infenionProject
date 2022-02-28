package tn.esprit.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.Type;
import tn.esprit.spring.service.ServiceClaimIT;

@RestController
@RequestMapping("/claim")

public class ClaimRestController {
	@Autowired
	 ServiceClaimIT  service;
	
	
@PostMapping("/add-claim")
@ResponseBody
public Claim addClaim(@RequestBody Claim c){
 Claim x=service.addClaim(c);
 return x;
	}
	
@GetMapping("retreive-all-claims")
@ResponseBody
public List<Claim>getClaims(){
	List<Claim> listClaims=service.retrieveAllClaims();
	return listClaims;
	
	
}

@DeleteMapping("/remove-claim/{claim-id}")
@ResponseBody
public void removeClaim(@PathVariable("claim-id")Long claimId){
	service.deleteClaim(claimId);
	
}
@GetMapping("retreive-claim/{claim-id}")
@ResponseBody
public Claim getClaim(@PathVariable("claim-id")Long claimId){
	return service.retrieveClaims(claimId);
	


}
@GetMapping("retreive-claim-byType/{Claim-type}")
@ResponseBody
public List<Claim>getClaimsBytype(@PathVariable("Claim-type") Type type){
	 return service.retreiveClaimsByType(type);
	 
	 
	
	
	
	
	
	
	
}}

