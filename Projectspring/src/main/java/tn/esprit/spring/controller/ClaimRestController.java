package tn.esprit.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import tn.esprit.spring.entities.Claim;
import tn.esprit.spring.entities.Type;
import tn.esprit.spring.exceptions.ResourceNotFoundException;
import tn.esprit.spring.exceptions.GlobalExceptionHandler;
import tn.esprit.spring.repository.ClaimRepository;
import tn.esprit.spring.service.ServiceClaimIT;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
@RequestMapping("/claim")

public class ClaimRestController {
	@Autowired
	 ServiceClaimIT  service;
	@Autowired
	ClaimRepository repo;
	
	
@PostMapping("/add-claim/{idUser}")
@ResponseBody  
public ResponseEntity<Claim> addClaim(@Valid @RequestBody Claim c,@PathVariable("idUser")Long idUser){
 Claim x=service.addClaim(c,idUser);
 return  new ResponseEntity<Claim>(x,HttpStatus.CREATED);
	}
	
@GetMapping("retreive-all-claims")
@ResponseBody
public List<Claim>getClaims(){
	List<Claim> listClaims=service.retrieveAllClaims();
	return listClaims;
	
	
}

@DeleteMapping("/delete-claim/{id}")
public ResponseEntity<Map<String, Boolean>> deleteClaim(@PathVariable Long id){
	Claim claim = repo.findById(id).orElse(null);
			
	
	repo.delete(claim);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return ResponseEntity.ok(response);
}

//@GetMapping("retreive-claim/{claim-id}")
//@ResponseBody
//public Claim getClaim(@PathVariable("claim-id")Long claimId){
//	return service.retrieveClaims(claimId);
//}
@GetMapping("/retreive-claimById/{id}")
public ResponseEntity<Claim> getClaimById(@PathVariable Long id) throws ResourceNotFoundException {
	 Optional<Claim> optionalClaim = service.retrieveClaims(id);
	 if (!optionalClaim.isPresent()) {
	      throw new ResourceNotFoundException("No Claim found with the id: " + id);
	    }	
	return  new ResponseEntity<>(optionalClaim.get(), HttpStatus.OK);
}
@GetMapping("retreive-claim-byType/{Claim-type}")
@ResponseBody
public List<Claim>getClaimsBytype(@PathVariable("Claim-type") Type type){
	 return service.retreiveClaimsByType(type);
	 
	 
	
}
@PostMapping("/check-claim-solution/{id}")
@ResponseBody  
public  void checkSolution(@PathVariable("id") Long idclaim){
	service.setResponsemessage(idclaim);
	
}
}
//@GetMapping("retreive-claims-byIdUser/{iduser}")
//@ResponseBody
//public List<Claim>getClaimsBytype(@PathVariable("iduser") Long iduser){
//	 return service.retreiveClaimUserid(iduser);
//	 
//	
//
//	
//}}


