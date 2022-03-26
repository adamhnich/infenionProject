package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.spring.entities.Employee;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.service.EntrepriseService;
import tn.esprit.spring.service.IEmployeeService;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseRestController {
	@Autowired
	EntrepriseService entrepriseService;
	@Autowired
	IEmployeeService employeeService;
	// http://localhost:8081/SpringMVC/entreprise/retrieve-all-entreprise
			
			@GetMapping("/retrieve-all-entreprise")
			public List<Entreprise> getEntreprises() {
				List<Entreprise> listEntreprises = entrepriseService.retrieveAllEntreprises();
				return listEntreprises;
			}

		// http://localhost:8081/SpringMVC/entreprise/retrieve-entreprise/1
		
		@GetMapping("/retrieve-entreprise/{entreprise-id}")
		public Entreprise retrieveEntreprise(@PathVariable("entreprise-id") int entrepriseId) {
			return entrepriseService.retrieveEntreprise(entrepriseId);
		}

		
		// http://localhost:8081/SpringMVC/entreprise/add-entreprise
		
		@PostMapping("/add-entreprise")
		public Entreprise addEntreprise(@RequestBody Entreprise e) {
			//return entrepriseService.addEntreprise(e);
			entrepriseService.addEntreprise(e);
			return e;
		}

		// http://localhost:8081/SpringMVC/entreprise/remove-entreprise/1
		@DeleteMapping("/remove-entreprise/{entreprise-id}")
		public void removeEntreprise(@PathVariable("entreprise-id") int entrepriseId) {
			entrepriseService.deleteEntreprise(entrepriseId);
		}

		// http://localhost:8081/SpringMVC/entreprise/modify-entreprise
		@PutMapping("/modify-entreprise/{identreprise}")
		public Entreprise modifyEntreprise(@RequestBody Entreprise e,@PathVariable("identreprise") int identreprise) {
			return entrepriseService.updateEntreprise(e,identreprise);
		}
}
